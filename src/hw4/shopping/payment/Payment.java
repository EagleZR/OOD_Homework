package hw4.shopping.payment;

import hw4.shopping.cart.receiptdecorators.IReceiptDecorator;
import hw4.shopping.cart.receiptdecorators.ReceiptDecorator;

/**
 * @author Mark Zeagler
 * @version 1.0
 */
public abstract class Payment extends ReceiptDecorator {

	double amount;

	Payment( IReceiptDecorator priorDecoration, double amount ) {
		super( priorDecoration );
		this.amount = amount;
	}
}
