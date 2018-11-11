package hw4.shopping.payment;

import hw4.shopping.cart.receiptdecorators.IReceiptDecorator;

/**
 * @author Mark Zeagler
 * @version 1.0
 */
public class CashPayment extends Payment {

	public CashPayment( IReceiptDecorator priorDecoration, double amount ) {
		super( priorDecoration, amount );
	}

	@Override public void printReceipt() {
		this.priorDecoration.printReceipt();
		System.out.printf( "\nPayment Type:%51s\nAmount:%57s", "Cash", String.format( "$%.2f", this.amount ) );
	}
}
