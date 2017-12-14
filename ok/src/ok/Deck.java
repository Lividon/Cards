package ok;

import java.util.ArrayList;

public class Deck {
	ArrayList<Card> unDealt;
	ArrayList<Card> Dealt;
	public Deck(String ranks[], String suits[], int value[]) 
	{
		ArrayList<Card> Deck = new ArrayList<Card>();
		for(int i = 0; i < ranks.length; i++)
			for(int j = 0; j < suits.length; j++)
			{
				{
				Deck.add(new Card(ranks[i], suits[j], value[j]));
				}
			}
		this.unDealt = Deck;
	}
	public boolean isEmpty()
	{
		if(unDealt.size() == 0)
			return true;
		return false;
	}
	public int size()
	{
		return unDealt.size();
	}
	public Card deal()
	{
		Card card = unDealt.get(1);
		unDealt.remove(1);
		return card;
	}
	public void shuffle()
	{
		//shuffle
	}

}
