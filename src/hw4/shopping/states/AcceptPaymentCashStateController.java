package hw4.shopping.states;

import java.util.Scanner;

/**
 * @author Mark Zeagler
 * @version 1.0
 */
public class AcceptPaymentCashStateController extends ShoppingCartStateController {

	AcceptPaymentCashStateController( Scanner in, IShoppingCart shoppingCart ) {
		super( in, shoppingCart );
	}

	@Override public void run() {
		// Welcome
		System.out.println( "---- Pay with Cash ----" );

		this.shoppingCart.submitCashPayment( getAmount() );

		this.shoppingCart.setState( new ShowReceiptStateController( this.in, this.shoppingCart ) );
	}

	private double getAmount() {
		// Loop until valid input
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
