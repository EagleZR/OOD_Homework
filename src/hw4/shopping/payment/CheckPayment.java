package hw4.shopping.payment;

import hw4.shopping.cart.receiptdecorators.IReceiptDecorator;

/**
 * @author Mark Zeagler
 * @version 1.0
 */
public class CheckPayment extends Payment {

	private int checkNumber;

	public CheckPayment( IReceiptDecorator priorDecoration, int checkNumber, double amount ) {
		super( priorDecoration, amount );
		this.checkNumber = checkNumber;
	}

	@Override public void printReceipt() {
		this.priorDecoration.printReceipt();
		System.out.printf(
				"\nPayment Type:%51s\nCheck Number:%51s\nAmount:%57s", "Check",
				String.format( "%d", this.checkNumber ), String.format( "$%.2f", this.amount ) );
	}
}
