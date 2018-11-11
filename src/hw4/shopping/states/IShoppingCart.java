package hw4.shopping.states;

/**
 * @author Mark Zeagler
 * @version 1.0
 */
public interface IShoppingCart {

	ShoppingCartStateController getState();

	void setState( ShoppingCartStateController state );

	void complete();

	boolean isComplete();

	void addItem( String name, double cost, int quantity );

	int getNumItems();

	double getTotalPrice();

	void submitCashPayment( double amount );

	void submitCheckPayment( int checkNumber, double amount );

	void printReceipt();
}
