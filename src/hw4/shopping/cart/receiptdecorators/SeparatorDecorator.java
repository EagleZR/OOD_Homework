package hw4.shopping.cart.receiptdecorators;

/**
 * @author Mark Zeagler
 * @version 1.0
 */
public class SeparatorDecorator extends ReceiptDecorator {

	public SeparatorDecorator( IReceiptDecorator priorDecoration ) {
		super( priorDecoration );
	}

	@Override public void printReceipt() {
		this.priorDecoration.printReceipt();
		System.out.print( "\n----------------------------------------------------------------" );
	}
}
