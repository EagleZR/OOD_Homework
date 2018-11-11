package hw4.shopping.states;

import java.util.Scanner;

/**
 * @author Mark Zeagler
 * @version 1.0
 */
public class AddItemsStateController extends ShoppingCartStateController {

	public AddItemsStateController( Scanner in, IShoppingCart shoppingCart ) {
		super( in, shoppingCart );
	}

	@Override public void run() {
		// Welcome
		System.out.println( "---- Add Items ----" );

		// Loop until shopping cart has at least 1 item and user is done
		boolean keepGoing = true;
		do {
			// Prompt
			System.out.println(
					"\nPlease enter the name of the product, the price (without currency sign), and quantity separated by commas:" );

			// Read input
			String[] inputData = readInput();

			// Check for "Done"
			keepGoing = !done( inputData );
			if ( keepGoing && validateInput( inputData ) ) {
				addItem( inputData );
			}

		} while ( keepGoing );
		this.shoppingCart.setState( new ChoosePaymentStateController( this.in, this.shoppingCart ) );
	}

	private String[] readInput() {
		String line = this.in.nextLine();
		return line.split( "," );
	}

	private boolean done( String[] inputData ) {
		return inputData.length == 1 && inputData[0].trim().toLowerCase().equals( "done" );
	}

	private boolean validateInput( String[] inputData ) {
		if ( inputData.length < 3 ) {
			System.out.println( "Please make sure you enter all of the values." );
			return false;
		} else if ( inputData.length > 3 ) {
			System.out.println(
					"Too many values were entered. Please make sure you only enter the name, price, and quantity." );
			return false;
		}
		return true;
	}

	private void addItem( String[] inputData ) {
		// Get name
		String name = inputData[0].trim();
		if ( name.length() < 5 ) {
			System.out.println( "Please make sure the product name has at least 5 characters." );
			return;
		}

		// Get price
		double price;
		try {
			price = Double.parseDouble( inputData[1].trim() );
			if ( price <= 0 ) {
				System.out.println( "Please ensure the price is greater than 0.00" );
				return;
			}
			if ( ( price * 100 ) % 1 > 0 ) {
				System.out.println( "Please ensure the price is has at most 2 decimal places" );
				return;
			}
		} catch ( NumberFormatException e ) {
			System.out.println( "Make sure the price (second value) is a number." );
			return;
		}

		// Get quantity
		int quantity;
		try {
			quantity = Integer.parseInt( inputData[2].trim() );
			if ( quantity <= 0 ) {
				System.out.println( "Please ensure the quantity is greater than 0" );
				return;
			}
		} catch ( NumberFormatException e ) {
			System.out.println( "Make sure the quantity (third value) is an integer number (no decimals)." );
			return;
		}

		// Add item to cart
		this.shoppingCart.addItem( name, price, quantity );
		System.out.println( "Item added." );
	}
}
