package ok;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
public class Deck {
	private ArrayList<Card> unDealt;
	private ArrayList<Card> Dealt = new ArrayList<Card>();
	public Deck(String ranks[], String suits[], int value[]) 
	{
		ArrayList<Card> Deck = new ArrayList<Card>();
		for(int i = 0; i < ranks.length; i++)
			for(int j = 0; j < suits.length; j++)
			{
				{
				Deck.add(new Card(ranks[i], suits[j], value[i]));
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
		if(unDealt.size() == 0)
		{
			return null;
		}
		else 
		{
			this.Dealt.add(this.unDealt.get(this.size()-1));
		}
		return this.unDealt.remove(this.size()-1);
	}
	public void shuffle()
	{
		unDealt.addAll(Dealt);
		Dealt.clear();
		for(int k = unDealt.size(); k < 1; k--)
		{
			int r = (int) (Math.random() *k );
			Collections.swap(unDealt, r, k);
		}
	}

}
