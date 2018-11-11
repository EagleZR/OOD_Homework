package hw4.shopping.cart.receiptdecorators;

/**
 * @author Mark Zeagler
 * @version 1.0
 */
public class ShoppingCartItem extends ReceiptDecorator {

	private int index;
	private String name;
	private double cost;
	private int quantity;

	public ShoppingCartItem( IReceiptDecorator priorDecoration, int index, String name, double cost, int quantity ) {
		super( priorDecoration );
		this.index = index;
		this.name = name;
		this.cost = cost;
		this.quantity = quantity;
	}

	@Override public void printReceipt() {
		this.priorDecoration.printReceipt();

		System.out.printf( "\n#%d)\t%10s|%12s|%9d|%26s", this.index, this.name, String.format( "$%.2f", this.cost ),
				this.quantity,
				String.format( "%d * $%.2f = $%.2f", this.quantity, this.cost, this.quantity * this.cost ) );
	}
}
