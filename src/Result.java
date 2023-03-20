public class Result {
	
	private int value;
	private char suit;
    boolean res;
    private String hand;
	
	
	
	public int getValue()
	{
		return this.value;
	}
	
	public char getSuit()
	{
		return this.suit;
	}
	
	public void setValue(int a)
	{
		this.value = a;
	}
	
	public void setSuit(char b)
	{
		this.suit = b;
	}
	
	public boolean getRes()
	{
		return this.res;
	}
	
	public void setRes(boolean c)
	{
		this.res = c;
	}
	
	public String getHand()
	{
		return this.hand;
	}
	
	public void setHand(String d)
	{
		this.hand = d;
	}
}