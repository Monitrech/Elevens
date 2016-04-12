/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		String[] ranks = {"Ace","2","3","4","5","6","7","8","9","10","jack", "queen", "king"};
		String[] suits = {"blue", "red"};
		int[] pointValues = {1,2,3,4,5,6,7,8,9,10,11, 12, 13};
		Deck deck1 = new Deck(ranks, suits, pointValues);
		Deck deck2 = new Deck(ranks, suits, pointValues);
		Deck deck3 = new Deck(ranks, suits, pointValues);
		
		System.out.println(deck1.isEmpty());
		System.out.println(deck1.size());
		System.out.println(deck1.deal().toString());
		System.out.println(deck1.deal().toString());
		System.out.println(deck1.deal().toString());
		
		System.out.println();
		
//		System.out.println(deck2.isEmpty());
//		System.out.println(deck2.size());
//		System.out.println(deck2.deal().toString());
//		System.out.println(deck2.deal().toString());
//		System.out.println(deck2.deal().toString());
		
		System.out.println();
		
//		System.out.println(deck2.isEmpty());
//		System.out.println(deck2.size());
//		System.out.println(deck2.deal().toString());
//		System.out.println(deck2.deal().toString());
//		System.out.println(deck2.deal().toString());
		
		System.out.println(deck2.toString());
		deck2.shuffle();
		System.out.println(deck2.toString());
		
		
	}
}