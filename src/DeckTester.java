/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		String[] ranks = {"jack", "queen", "king"};
		String[] suits = {"blue", "red"};
		int[] pointValues = {11, 12, 13};
		Deck deck1 = new Deck(ranks, suits, pointValues);
		Deck deck2 = new Deck(ranks, suits, pointValues);
		Deck deck3 = new Deck(ranks, suits, pointValues);
		
		System.out.println(deck1.isEmpty());
		System.out.println(deck1.size());
		System.out.println(deck1.deal().toString());
		System.out.println(deck1.deal().toString());
		System.out.println(deck1.deal().toString());
		
<<<<<<< HEAD
		//deck1.perfectShuffle();
		deck1.shuffle();
=======
		System.out.println();
		
		System.out.println(deck2.isEmpty());
		System.out.println(deck2.size());
		System.out.println(deck2.deal().toString());
		System.out.println(deck2.deal().toString());
		System.out.println(deck2.deal().toString());
		
		System.out.println();
		
		System.out.println(deck2.isEmpty());
		System.out.println(deck2.size());
		System.out.println(deck2.deal().toString());
		System.out.println(deck2.deal().toString());
		System.out.println(deck2.deal().toString());
		
>>>>>>> origin/master
		
	}
}
