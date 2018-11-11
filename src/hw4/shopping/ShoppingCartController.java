package hw4.shopping;

import hw4.shopping.cart.ShoppingCart;
import hw4.shopping.states.AddItemsStateController;

import java.util.Scanner;

/**
 * @author Mark Zeagler
 * @version 1.0
 */
public class ShoppingCartController implements Runnable {

	private ShoppingCart shoppingCart;
	private Scanner in;

	public ShoppingCartController( Scanner in ) {
		this.in = in;
	}

	@Override public void run() {
		if ( shoppingCart == null ) {
			this.shoppingCart = new ShoppingCart();
			this.shoppingCart.setState( new AddItemsStateController( this.in, this.shoppingCart ) );
		}
		boolean keepGoing = true;
		do {
			this.shoppingCart.getState().run();

			if ( this.shoppingCart.isComplete() ) {
				keepGoing = promptNewCart();
			}
		} while ( keepGoing );
	}

	private boolean promptNewCart() {
		char readValue = 0;
		do {
			System.out.print( "Would you like to create a new shopping cart? (y/n): " );
			String line = this.in.nextLine();
			char firstChar = line.toLowerCase().charAt( 0 );
			if ( firstChar == 'y' || firstChar == 'n' ) {
				readValue = firstChar;
			} else {
				System.out.println( "\"" + line + "\" is not an acceptable input. Please enter either 'y' or 'n'\n" );
			}
		} while ( readValue == 0 );

		if ( readValue == 'y' ) {
			this.shoppingCart = new ShoppingCart();
			this.shoppingCart.setState( new AddItemsStateController( this.in, this.shoppingCart ) );
			return true;
		} else {
			return false;
		}
	}
}
