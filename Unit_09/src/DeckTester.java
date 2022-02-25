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
		
		/*	
		System.out.println("What is the deck size:: " + testDeck.size());
		System.out.println("Is the deck empty or not ::" + testDeck.isEmpty());
		testDeck.shuffle();
		testDeck.deal();
		System.out.print("\n");
		System.out.println(testDeck.toString());
	*/	
		
		System.out.println("Shuffle Method");
		String[] RANK1 = new String[52]; 
		String[] SUIT1 = new String[52]; 
		int[] POINTVALUE1 = new int[52]; 
		
		
		
		
		
		
		
		
		 for (int i = 0; i < 52; i++) {
	            String rank = "";
	            String suit = "";
	            if ( (i+1) % 13 == 11 ) {
	                rank = "Jack";
	            }
	            else if ( (i+1) % 13 == 12 ) {
	                rank = "Queen";
	            }
	            else if ( (i+1) % 13 == 0 ) {
	                rank = "King";
	            }
	            else if ( (i+1) % 13 == 1 ) {
	                rank = "Ace";
	            }
	            else {
	                rank = Integer.toString((i + 1) % 13);
	            }
	            
	            if (i < 13) {
	                suit = "Hearts";
	            }
	            else if (i < 26) {
	                suit = "Diamonds";
	            }
	            else if (i < 39) { 
	                suit = "Clubs";
	            }
	            else {
	                suit = "Spades";
	            }
	            
	          RANK1[i] = rank;
	            SUIT1[i] = suit;
	            POINTVALUE1[i] = ((i+1) % 13);
	            Deck testDeck1 = new Deck(RANK1 ,SUIT1, POINTVALUE1);
	            System.out.print(testDeck1);
		
		
	}
}}
