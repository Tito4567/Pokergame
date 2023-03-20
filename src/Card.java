public class Card extends Suit
{
	// written by Gilberto Rose 10:09 am 5/6/2021
	
	public Card(char A, int B)
	{
		this.suit = A;
		this.number = B;
	}

	@Override
	public int getNumber()
	{
		return this.number;
	}

	@Override
	public char getSuit()
	{
		return this.suit;
	}

}
