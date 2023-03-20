public class Player {

	private String hand = "";
	private int highestValue;
	private int handNumbered;

	public void preter(boolean k, Handtest m) {
		
		
		if (k == true) {
			this.hand = m.getHand();
			this.highestValue = m.getHighestValue();
		}

		switch (hand) {
		case "High Card":
			handNumbered = 1;
			break;

		case "Pair":
			handNumbered = 2;
			break;
		
		case "Two Pairs":
			handNumbered = 3;
			break;
			
		case "Three of a kind":
			handNumbered = 4;
			break;
			
		case "Straight":
			handNumbered = 5;
			break;
			
		case "Flush":
			handNumbered = 6;
			break;
			
		case "Full House":
			handNumbered = 7;
			break;
			
		case "Four of a kind":
			handNumbered = 8;
			break;
			
		case "Straight Flush":
			handNumbered = 9;
			break;
		}
		
	}
	
	public int getValue()
	{
		return this.highestValue;
	}
	
	public int getHandNumbered()
	{
		return this.handNumbered;
	}
}