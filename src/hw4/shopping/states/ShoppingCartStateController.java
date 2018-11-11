package hw4.shopping.states;

import java.util.Scanner;

/**
 * @author Mark Zeagler
 * @version 1.0
 */
public abstract class ShoppingCartStateController implements Runnable {

	Scanner in;
	IShoppingCart shoppingCart;

	ShoppingCartStateController( Scanner in, IShoppingCart shoppingCart ) {
		this.in = in;
		this.shoppingCart = shoppingCart;
	}
}
