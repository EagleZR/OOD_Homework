package hw4.shopping.cart.receiptdecorators;

import org.jetbrains.annotations.NotNull;

/**
 * @author Mark Zeagler
 * @version 1.0
 */
public class ItemTitleDecorator extends ReceiptDecorator {

	public ItemTitleDecorator( @NotNull IReceiptDecorator priorDecoration ) {
		super( priorDecoration );
	}

	@Override public void printReceipt() {
		this.priorDecoration.printReceipt();

		System.out.printf( "\n%-4s%9s | %10s | %7s | %25s", "No.", "Name", "Ind. Price", "Quant.", " Price Calculation" );
	}
}
