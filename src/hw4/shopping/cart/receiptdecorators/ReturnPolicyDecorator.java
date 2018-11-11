package hw4.shopping.cart.receiptdecorators;

import org.jetbrains.annotations.NotNull;

/**
 * @author Mark Zeagler
 * @version 1.0
 */
public class ReturnPolicyDecorator extends ReceiptDecorator {

	public ReturnPolicyDecorator( @NotNull IReceiptDecorator priorDecoration ) {
		super( priorDecoration );
	}

	@Override public void printReceipt() {
		this.priorDecoration.printReceipt();

		System.out.print( "\nReturn Policy:\nThis item can only be returned within 15 days of the date of\npurchase." );
	}
}
