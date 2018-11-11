package hw4.shopping.states;

import java.util.Scanner;

/**
 * @author Mark Zeagler
 * @version 1.0
 */
public class AcceptPaymentCheckStateController extends ShoppingCartStateController {

	AcceptPaymentCheckStateController( Scanner in, IShoppingCart shoppingCart ) {
		super( in, shoppingCart );
	}

	@Override public void run() {
		// Welcome
		System.out.println( "---- Pay with Check ----" );

		this.shoppingCart.submitCheckPayment( getCheckNumber(), getAmount() );

		this.shoppingCart.setState( new ShowReceiptStateController( this.in, this.shoppingCart ) );
	}

	private int getCheckNumber() {
		// Loop until valid check number
		while ( true ) {
			// Prompt
			System.out.print( "\nPlease input the check number: " );

			// Read input
			String line = this.in.nextLine().trim();

			// Validate
			int checkNumber;
			try {
				checkNumber = Integer.parseInt( line );
			} catch ( NumberFormatException e ) {
				System.out.println( "Invalid input. Please enter a number." );
				continue;
			}

			// Check if it's equal to cart total
			if ( checkNumber > 100 ) {
				System.out.println( "Check Number accepted." );
				return checkNumber;
			} else {
				System.out.println( "The check number must be greater than 100." );
			}
		}
	}

	private double getAmount() {
		// Loop until valid amount
		while ( true ) {
			// Prompt
			System.out.printf(
					"\nThe total price of the cart is $%.2f. How much would you like to pay (without currency symbol)?",
					this.shoppingCart.getTotalPrice() );

			// Read input
			String line = this.in.nextLine().trim();

			// Validate
			double amount;
			try {
				amount = Double.parseDouble( line );
			} catch ( NumberFormatException e ) {
				System.out.println( "Please enter a valid amount." );
				continue;
			}

			// Check if it's equal to cart total
			if ( Math.abs(amount - this.shoppingCart.getTotalPrice()) < 0.01 ) {
				System.out.println( "Payment accepted." );
				return amount;
			} else {
				System.out.println( "The amount you entered is not the full price of the cart." );
			}
		}
	}
}
