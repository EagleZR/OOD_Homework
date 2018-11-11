package hw4.shopping.cart.receiptdecorators;

import org.jetbrains.annotations.NotNull;

/**
 * @author Mark Zeagler
 * @version 1.0
 */
public class ThankYouDecorator extends ReceiptDecorator {

	public ThankYouDecorator( @NotNull IReceiptDecorator priorDecoration ) {
		super( priorDecoration );
	}

	@Override public void printReceipt() {
		this.priorDecoration.printReceipt();

		System.out.print( "\nThank you very much for shopping with us." );
	}
}
