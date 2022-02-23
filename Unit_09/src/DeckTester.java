/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		
				
		String[] rankk = {"C" , "D", "E"};
		String[] suitt = {"Aces", "Spades", "Hearts"};
		int[] PV = {2, 4, 5};
		
		Deck testDeck = new Deck(rankk ,suitt, PV); 
		
		
		System.out.println("What is the deck size:: " + testDeck.size());
		System.out.println("Is the deck empty or not ::" + testDeck.isEmpty());
		testDeck.shuffle();
		testDeck.deal();
		System.out.print("\n");
		System.out.println(testDeck.toString());
		
		
		System.out.println("Shuffle Method");
		String[] RANK1 = new String[52]; 
		String[] SUIT1 = new String[52]; 
		int[] POINTVALUE1 = new int[52]; 
		
		
		
		
		
		Deck testDeck1 = new Deck(RANK1 ,SUIT1, POINTVALUE1);
		
		testDeck1.shuffle();
	System.out.print(	testDeck1.toString()); 
		
		
		
	}
}
