package ok;

public class Card {

	private String rank;
	private String suit;
	private int pointValue;
	public Card(String rank, String suit, int pValue) 
	{
		this.rank = rank;
		this.suit = suit;
		this.pointValue = pValue;
	}
	public boolean equals(Card card1, Card card2)
	{
		if(card1.pointValue == card2.pointValue)
		{
			return true;
		}
		return false;
	}
	public String getRank(Card Card)
	{
		return(Card.rank);
	}
	public String getSuit(Card Card)
	{
		return(Card.suit);
	}
	public int getPointValue(Card Card)
	{
		return(Card.pointValue);
	}
	public String toString()
	{
		return("Card:" + this.rank + "Which has a suit of" + this.suit + "And has a point value of:" + this.pointValue);
	}

}
