package hw4;

import hw4.shopping.ShoppingCartController;

import java.util.Scanner;

/**
 * @author Mark Zeagler
 * @version 1.0
 */
public class Main {
	public static void main( String[] args ) {
		//		System.out.println( "Welcome to Mark Zeagler's Store of Awesomeness" );
		//
		Scanner in = new Scanner( System.in );
		//		int option = 0;
		//		ArrayList<Integer> options = new ArrayList<>( Arrays.asList( 1, 2 ) );
		//		do {
		//			System.out.println( "\t1. Create a new shopping cart." );
		//			System.out.println( "\t2. Edit an existing shopping cart." );
		//			System.out.print( "\nPlease select what you would like to do: " );
		//
		//			String line = in.nextLine();
		//			try {
		//				int selected = Integer.parseInt( line.substring( 0, 1 ) );
		//				if ( options.contains( selected ) ) {
		//					option = selected;
		//				} else {
		//					System.out.print( "\"" + option + "\" is not a valid option. Available options: [" );
		//					for ( int i = 0; i < options.size(); i++ ) {
		//						System.out.print( options.get( i ) + ( i == options.size() - 1 ? "" : ", " ) );
		//					}
		//					System.out.println( "]." );
		//				}
		//			} catch ( NumberFormatException e ) {
		//				System.out.println( "\"" + line + "\" is not a valid input.\n" );
		//			}
		//		} while ( !options.contains( option ) );
		//
		//		if ( option == 1 ) {
		ShoppingCartController controller = new ShoppingCartController( in );
		controller.run();
		//		}
	}
}
