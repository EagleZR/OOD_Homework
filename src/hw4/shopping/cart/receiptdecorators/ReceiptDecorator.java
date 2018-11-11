package hw4.shopping.cart.receiptdecorators;

import org.jetbrains.annotations.NotNull;

/**
 * @author Mark Zeagler
 * @version 1.0
 */
public abstract class ReceiptDecorator implements IReceiptDecorator {

	protected IReceiptDecorator priorDecoration;

	private ReceiptDecorator() {

	}

	protected ReceiptDecorator( @NotNull IReceiptDecorator priorDecoration ) {
		this.priorDecoration = priorDecoration;
	}

	/**
	 * Automatically decorates with {@link SeparatorDecorator}.
	 *
	 * @return
	 */
	public static IReceiptDecorator getRoot() {
		return new SeparatorDecorator( new RootDecorator() );
	}

	private static class RootDecorator extends ReceiptDecorator {

		@Override public void printReceipt() {

		}
	}
}
