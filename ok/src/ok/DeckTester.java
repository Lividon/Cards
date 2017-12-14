package ok;

public class DeckTester {
	public static void main(String[] args)
	{
		String[] ranks = {"A", "B", "C"};
		String[] suits = {"puppies", "cats", "cats"};
		int[] points = {1,3,6};
		Deck Deck = new Deck(ranks, suits, points);
		System.out.print(Deck.size());
	}
	public DeckTester() {
		
	}

}
