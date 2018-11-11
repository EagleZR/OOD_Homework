package hw4.shopping.cart.receiptdecorators;

import org.jetbrains.annotations.NotNull;

/**
 * @author Mark Zeagler
 * @version 1.0
 */
public class TotalPriceDecorator extends ReceiptDecorator {

	private double totalPrice;

	public TotalPriceDecorator( @NotNull IReceiptDecorator priorDecoration, double totalPrice ) {
		super( priorDecoration );
		this.totalPrice = totalPrice;
	}

	@Override public void printReceipt() {
		this.priorDecoration.printReceipt();
		System.out.printf( "\n\nTotal price:%52s", String.format( "$%.2f", this.totalPrice ) );
	}
}
