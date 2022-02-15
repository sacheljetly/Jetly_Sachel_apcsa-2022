/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card one = new Card ("3", "Spades", 4 );
		Card two = new Card ("2","Hearts", 8 );
		Card three = new Card ("3","Spades", 4 );
		
		System.out.println("What is the suit of the first card :: " + one.suit());
		System.out.println("What is the second card :: " + two.toString());
		System.out.println("Does the second card match the first card::  " + two.matches(one));
		System.out.println("Does the third card match the first card :: " + three.matches(one));
		
	}
}
