package hw4.shopping.states;

import java.util.Scanner;

/**
 * @author Mark Zeagler
 * @version 1.0
 */
public class ChoosePaymentStateController extends ShoppingCartStateController {

	ChoosePaymentStateController( Scanner in, IShoppingCart shoppingCart ) {
		super( in, shoppingCart );
	}

	@Override public void run() {
		// Welcome
		System.out.println( "---- Choose Payment Type ----" );

		// Loop until chosen
		while ( true ) {
			// Prompt
			System.out.print( "\nWould you like to pay with cash or check? " );
			String choice = in.nextLine().trim().toLowerCase();

			// Handle input
			switch ( choice ) {
				case "cash":
					this.shoppingCart.setState( new AcceptPaymentCashStateController( this.in, this.shoppingCart ) );
					return;
				case "check":
					this.shoppingCart.setState( new AcceptPaymentCheckStateController( this.in, this.shoppingCart ) );
					return;
				default:
					System.out.println( "Please make sure you only enter either 'cash' or 'check'." );
					break;
			}
		}
	}
}
