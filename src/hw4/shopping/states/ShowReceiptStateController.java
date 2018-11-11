package hw4.shopping.states;

import java.util.Scanner;

/**
 * @author Mark Zeagler
 * @version 1.0
 */
public class ShowReceiptStateController extends ShoppingCartStateController {

	ShowReceiptStateController( Scanner in, IShoppingCart shoppingCart ) {
		super( in, shoppingCart );
	}

	@Override public void run() {
		System.out.println( "---- Receipt ----" );

		this.shoppingCart.printReceipt();

		// Close out cart
		this.shoppingCart.complete();
	}
}
