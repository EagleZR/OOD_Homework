package hw4.shopping.cart;

import hw4.shopping.cart.receiptdecorators.*;
import hw4.shopping.payment.CashPayment;
import hw4.shopping.payment.CheckPayment;
import hw4.shopping.payment.Payment;
import hw4.shopping.states.IShoppingCart;
import hw4.shopping.states.ShoppingCartStateController;

/**
 * @author Mark Zeagler
 * @version 1.0
 */
public class ShoppingCart implements IShoppingCart {

	private ShoppingCartItem latestItem;
	private Payment payment;
	private int numItems = 0;
	private double totalPrice = 0;
	private ShoppingCartStateController state;
	private boolean completed = false;

	@Override public ShoppingCartStateController getState() {
		return this.state;
	}

	@Override public void setState( ShoppingCartStateController state ) {
		this.state = state;
	}

	@Override public void complete() {
		this.completed = true;
	}

	@Override public boolean isComplete() {
		return this.completed;
	}

	@Override public void addItem( String name, double cost, int quantity ) {
		this.latestItem = new ShoppingCartItem( this.latestItem == null ? getRoot() : this.latestItem, ++this.numItems,
				name, cost, quantity );
		this.totalPrice += ( cost * quantity );
	}

	private IReceiptDecorator getRoot() {
		return new ItemTitleDecorator( ReceiptDecorator.getRoot() );
	}

	@Override public double getTotalPrice() {
		return totalPrice;
	}

	@Override public int getNumItems() {
		return numItems;
	}

	private IReceiptDecorator addTotalDecorator() {
		return new SeparatorDecorator( new TotalPriceDecorator( this.latestItem, this.totalPrice ) );
	}

	@Override public void submitCashPayment( double amount ) {
		this.payment = new CashPayment( addTotalDecorator(), amount );
	}

	@Override public void submitCheckPayment( int checkNumber, double amount ) {
		this.payment = new CheckPayment( addTotalDecorator(), checkNumber, amount );
	}

	@Override public void printReceipt() {
		new SeparatorDecorator( new ThankYouDecorator(
				new SeparatorDecorator( new ReturnPolicyDecorator( new SeparatorDecorator( this.payment ) ) ) ) )
				.printReceipt();
		System.out.println();
	}
}
