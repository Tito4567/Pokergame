public class Handtest {
	
			String hand;
			int highestValue;

	// Straight Flush Test
	public boolean straightFlushTest(Card[] s) { // has report 
		int clubs = 0;
		int diamonds = 0;
		int hearts = 0;
		int spades = 0;
		boolean hand = false;
		boolean description = false;
		

		// Bubble sort
		int n = s.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (s[j].getNumber() > s[j + 1].getNumber()) {
					Card temp = s[j];
					s[j] = s[j + 1];
					s[j + 1] = temp;
				}
			}
		}
		// End of Bubble sort

		for (Card i : s) {
			switch (i.getSuit()) {
			case 'c':

				clubs++;
				if (clubs == 5) {
					boolean loop = true;
					int j = s[0].getNumber();
					int count = 0;
//					while (loop) {
//						if (++j == s[count].getNumber()) {
//							count++;
//							loop = true;
//							if (count == 4) {
//								report("Straight Flush", s[4].getNumber());
//								loop = false;
//								description = true;
//							}
//						} /*else {
//							loop = false;
//							report("Flush", s[4].getNumber());
//							description = false;
//						}*/
//					}
					
					do 
					{
						if(j != s[count].getNumber())
						{
							loop = false;
							description = false;
							
							
						} else {description = true;}
						
						
						count++;
						j++;
						report("Straight Flush", s[4].getNumber());
					} while (loop && count < s.length);
					
				}

				break;

			case 'd':
				diamonds++;
				if (diamonds == 5) {
					boolean loop = true;
					int j = s[0].getNumber();
					int count = 0;
					
//					while (loop) {
//							if (j == s[count].getNumber()) {
//							System.out.println(j+" value is");
//							count++;
//							loop = true;
//							if (count == 4) {
//								report("Straight Flush", s[4].getNumber());
//								loop = false;
//								description = true; 
//				}
//				
//						} /*else {
//							loop = false;
//							report("Flush", s[4].getNumber());
//							description = false;
//						}*/
//					} above the else statement while loop is commented out for testing new loop.
					
					do 
					{
						if(j != s[count].getNumber())
						{
							loop = false;
							description = false;
							
						} else {description = true; }
						
						
						count++;
						j++;
						report("Straight Flush", s[4].getNumber());
					}while (loop && count < s.length);
					
				}
				break;

			case 'h':
				hearts++;
				if (hearts == 5) {
					boolean loop = true;
					int j = s[0].getNumber();
					int count = 0;
//					while (loop) {
//						if (++j == s[count].getNumber()) {
//							count++;
//							loop = true;
//							if (count == 4) {
//								report("Straight Flush", s[4].getNumber());
//								loop = false;
//								description = true;
//								
//							}
//						} /*else {
//							loop = false;
//							report("Flush", s[4].getNumber());
//							description = false;
//						}*/
//					}
					
					do 
					{
						if(j != s[count].getNumber())
						{
							loop = false;
							description = false;
							
						} else {description = true;}
						
						
						count++;
						j++;
						report("Straight Flush", s[4].getNumber());
					}while (loop && count < s.length);
				}
				break;

			case 's':
				spades++;
				if (spades == 5) {
					boolean loop = true;
					int j = s[0].getNumber();
					int count = 0;
//					while (loop) {
//						if (++j == s[count].getNumber()) {
//							count++;
//							loop = true;
//							if (count == 4) {
//								report("Straight Flush", s[4].getNumber());
//								loop = false;
//								description = true;
//							}
//						} /*else {
//							loop = false;
//							report("Flush", s[4].getNumber());
//							description = false;
//						}*/
//					}
					
					do 
					{
						if(j != s[count].getNumber())
						{
							loop = false;
							description = false;
							
						} else {description = true;}
						
						
						count++;
						j++;
						report("Straight Flush", s[4].getNumber());
					}while (loop && count < s.length);
					
				}
				
				break;

			}

		}
		return description;

	}

	public boolean straight(Card[] s) { // Has Report
		
		boolean description = false;
		// Bubble sort
		int n = s.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (s[j].getNumber() > s[j + 1].getNumber()) {
					Card temp = s[j];
					s[j] = s[j + 1];
					s[j + 1] = temp;
				}
			}
		} // End of Bubble sort

		
		int spades = 0;
		int diamonds = 0;
		int hearts = 0;
		int clubs = 0;
		boolean loop = true;
		int j = s[0].getNumber();
		int count = 0;
		int count2 = 0;
		do {
			
			switch(s[count].getSuit())
			{
			case 's':
				spades++;
				break;
			case 'd':
				diamonds++;
				break;
			case 'h':
				hearts++;
				break;
			case 'c':
				clubs++;
				break;
			}
			
			if (j++ == s[count].getNumber()) {
				count++;
				
				loop = true;
				
				
			} else {
				loop = false; description = false; 
			}
		} while(loop && (count < 5));
		
		
		if (count == 5 && (clubs != 5 && hearts != 5 && diamonds != 5 && spades != 5)) {
			
			report("Straight", s[4].getNumber()); description = true;  
			
			
		}
		
		
		
		
//		 abandon commented code below
//		int spades = 0;
//		int diamonds = 0;
//		int hearts = 0;
//		int clubs = 0;
//		int count2 = 0;
//		int count = s[0].getNumber();
//		for(Card i : s)
//		{
//			switch(s[count2].getSuit())
//			{
//			case 's':
//				spades++;
//				break;
//			case 'd':
//				diamonds++;
//				break;
//			case 'h':
//				hearts++;
//				break;
//			case 'c':
//				clubs++;
//				break;
//			}
//			
//			
//			count2++;
//			
//			if (diamonds != 5 && spades != 5 && hearts != 5 && clubs != 5) && (count)
//			{
//				System.out.println(spades);
//			}
		return description;	
	}
		
		
	public boolean fourOfAKind(Card[] s) { // Has Report
		boolean description = false;
		// Bubble sort
		int n = s.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (s[j].getNumber() > s[j + 1].getNumber()) {
					Card temp = s[j];
					s[j] = s[j + 1];
					s[j + 1] = temp;
				}
			}
		} // End of Bubble sort

		if (s[0].getNumber() == s[1].getNumber() && s[2].getNumber() == s[3].getNumber()
				&& s[1].getNumber() == s[2].getNumber() && s[0].getNumber() != s[4].getNumber()) {
			report("Four of a kind", s[0].getNumber()); description = true;
		} else if (s[4].getNumber() == s[3].getNumber() && s[2].getNumber() == s[1].getNumber()
				&& s[3].getNumber() == s[2].getNumber() && s[4].getNumber() != s[0].getNumber()) {
			report("Four of a kind", s[4].getNumber()); description = true;
		}
		return description; 
	}

	public boolean fullHouse(Card[] s) { // Has Report
		boolean description = false;
		// Bubble sort
		int n = s.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (s[j].getNumber() > s[j + 1].getNumber()) {
					Card temp = s[j];
					s[j] = s[j + 1];
					s[j + 1] = temp;
				}
			}
		} // End of Bubble sort

		if (s[0].getNumber() == s[1].getNumber() && s[0].getNumber() == s[2].getNumber() && s[0].getNumber() != s[4].getNumber()) {
						
			if (s[4].getNumber() == s[3].getNumber()) { 
				report("Full House", s[0].getNumber()); description = true;
			}/*else {threeOfAKind(s);}*/
		}

		else if (s[4].getNumber() == s[3].getNumber() && s[4].getNumber() == s[2].getNumber() && s[4].getNumber() != s[0].getNumber()) {
			if (s[0].getNumber() == s[1].getNumber()) {
				report("Full House", s[4].getNumber()); description = true;
			}/*else {threeOfAKind(s);}*/
		} 
		
//		else if (s[1].getNumber() == s[2].getNumber() && s[1].getNumber() == s[3].getNumber())
//		{
//			/*report("Three of a Kind", s[1].getNumber());*/ threeOfAKind(s); description = false; 
//		}
		return description;

	}

	public boolean pair(Card[] s) { // Has Report
		boolean description = false;
		// Bubble sort
		int n = s.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (s[j].getNumber() > s[j + 1].getNumber()) {
					Card temp = s[j];
					s[j] = s[j + 1];
					s[j + 1] = temp;
				}
			}
		} // End of Bubble sort

		if (s[0].getNumber() == s[1].getNumber() && (twoPairs(s) == false) && (fullHouse(s) == false) && (s[0].getNumber() != s[2].getNumber()) && (s[0].getNumber() != s[3].getNumber()) && s[0].getNumber() != s[4].getNumber()) {
			report("Pair", s[0].getNumber()); description = true; 
		}

		else if (s[4].getNumber() == s[3].getNumber() && (twoPairs(s) == false) && (fullHouse(s) == false) && (s[3].getNumber() != s[2].getNumber()) && (s[3].getNumber() != s[0].getNumber()) && (s[3].getNumber() != s[1].getNumber()) ) {
			
			report("Pair", s[4].getNumber()); description = true;
		}
		
		else if (s[2].getNumber() == s[3].getNumber() && (twoPairs(s) == false) && (fullHouse(s) == false) && (s[2].getNumber() != s[4].getNumber()) && (s[2].getNumber() != s[0].getNumber()) && (s[2].getNumber() != s[1].getNumber())) {
			
			report("Pair", s[2].getNumber()); description = true;
		}
		
		else if (s[1].getNumber() == s[2].getNumber() && (twoPairs(s) == false) && (fullHouse(s) == false) && (s[1].getNumber() != s[3].getNumber()) && (s[1].getNumber() != s[4].getNumber()) && (s[1].getNumber() != s[0].getNumber())) {
			
			report("Pair", s[1].getNumber()); description = true;
		}
		return description;

	}
	
	public boolean twoPairs(Card[] s) // Has Report
	{
		boolean description = false;
		// Bubble sort
				int n = s.length;
				for (int i = 0; i < n - 1; i++) {
					for (int j = 0; j < n - i - 1; j++) {
						if (s[j].getNumber() > s[j + 1].getNumber()) {
							Card temp = s[j];
							s[j] = s[j + 1];
							s[j + 1] = temp;
							
							
						}
					}
				} // End of Bubble sort
				
						
		if((s[0].getNumber() == s[1].getNumber()) && (s[2].getNumber() == s[3].getNumber()) && (s[0].getNumber() != s[2].getNumber()) && (fullHouse(s) == false)) // works
		{
			description = true; 
			if((s[0].getNumber() > s[2].getNumber())) 
			{ 
				report("Two Pairs", s[0].getNumber());
			}else {report("Two Pairs", s[2].getNumber());}
		}
		
		
		else if(s[0].getNumber() == s[1].getNumber() && s[3].getNumber() == s[4].getNumber() && s[0].getNumber() != s[3].getNumber() && (fullHouse(s) == false)) // works
		{
			
			
			description = true; 
			if(s[0].getNumber() > s[3].getNumber())
			{
				report("Two Pairs", s[0].getNumber());
			}else {report("Two Pairs", s[3].getNumber()); }
			
		}		
		
		
		else if(s[4].getNumber() == s[3].getNumber() && s[1].getNumber() == s[0].getNumber() && s[4].getNumber() != s[1].getNumber() && (fullHouse(s) == false)) // works
		{
			
			description = true;
			 if(s[4].getNumber() > s[1].getNumber())
				{
					report("Two Pairs", s[4].getNumber());
				}else {report("Two Pairs", s[1].getNumber());}			
		}
		 		
		
		else if(s[4].getNumber() == s[3].getNumber() && s[2].getNumber() == s[1].getNumber() && s[4].getNumber() != s[2].getNumber() && (fullHouse(s) == false)) // works
		{
			
			description = true; 
			if(s[4].getNumber() > s[2].getNumber())
			{
				report("Two Pairs", s[4].getNumber());
			}else {report("Two Pairs", s[2].getNumber());}			
		}
		
		return description;
		
	}
	
	public boolean threeOfAKind(Card[] s)
	{	boolean description = false; 
		// Bubble sort
		int n = s.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (s[j].getNumber() > s[j + 1].getNumber()) {
					Card temp = s[j];
					s[j] = s[j + 1];
					s[j + 1] = temp;
				}
			}
		} // End of Bubble sort
		
		/*if(s[0].getNumber() == s[1].getNumber() && s[0].getNumber() == s[2].getNumber() && s[0].getNumber() != s[3].getNumber())
		{
			report("", s[0].getNumber()); description = false;
		}
		
		else if(s[4].getNumber() == s[3].getNumber() && s[4].getNumber() == s[2].getNumber() && s[4].getNumber() != s[1].getNumber())
		{
			report("Three of a Kind", s[4].getNumber()); description = false;
		}
		
		else if(s[1].getNumber() == s[2].getNumber() && s[1].getNumber() == s[3].getNumber() && s[4].getNumber() != s[1].getNumber() && s[0].getNumber() != s[1].getNumber())
		{
			report("Three of a Kind", s[1].getNumber()); description = false;
		}*/
		
		// Below is attempted code copied from fullHouse and pasted here.
		if (s[0].getNumber() == s[1].getNumber() && s[0].getNumber() == s[2].getNumber() && s[0].getNumber() != s[4].getNumber() && (fullHouse(s) == false) && (fourOfAKind(s) == false)) {
			
			if (s[4].getNumber() != s[3].getNumber()) { 
				report("Three of a kind", s[0].getNumber()); description = true;  
			}/*else {threeOfAKind(s);}*/
		}

		else if (s[4].getNumber() == s[3].getNumber() && s[4].getNumber() == s[2].getNumber() && s[4].getNumber() != s[0].getNumber() && (fullHouse(s) == false) && (fourOfAKind(s) == false)) {
			
			if (s[0].getNumber() != s[1].getNumber()) {
				report("Three of a kind", s[4].getNumber()); description = true; 
			}/*else {threeOfAKind(s);}*/
		}
		
		else if (s[1].getNumber() == s[2].getNumber() && s[1].getNumber() == s[3].getNumber() && (s[1].getNumber() != s[0].getNumber()) && s[1].getNumber() != s[4].getNumber()&& (fourOfAKind(s) == false))
		{
			report("Three of a kind", s[1].getNumber());
			description = true; 
		}
		// Above is attempted code copied from fullHouse and pasted here. 
		
		return description;
	}
	
	public boolean flush(Card[] s)
	{ 
		boolean description = false;
		// Bubble sort
			int n = s.length;
				for (int i = 0; i < n - 1; i++) {
					for (int j = 0; j < n - i - 1; j++) {
						if (s[j].getNumber() > s[j + 1].getNumber()) {
							Card temp = s[j];
							s[j] = s[j + 1];
							s[j + 1] = temp;
						}
					}
				} // End of Bubble sort
				
	  if(s[0].getSuit() == s[1].getSuit() && s[0].getSuit() == s[2].getSuit() && s[0].getSuit() == s[3].getSuit() && s[0].getSuit() == s[4].getSuit() && (straightFlushTest(s) == false))
	  {
		  description = true;	  
	  }
	  	report("Flush",s[4].getNumber());
		return description;
	}
	
	public boolean highCard(Card[] s)
	{ 
		boolean description = false;
		// Bubble sort
		int n = s.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (s[j].getNumber() > s[j + 1].getNumber()) {
					Card temp = s[j];
					s[j] = s[j + 1];
					s[j + 1] = temp;
				}
			}
		} // End of Bubble sort
		
		if((fullHouse(s) == false) && (twoPairs(s) == false) && (straightFlushTest(s) == false) && (straight(s) == false) && (pair(s) == false) && (fourOfAKind(s) == false) && (threeOfAKind(s) == false) && (flush(s) == false))
		{
			
			description = true;
			
			report("High Card",s[4].getNumber());
		}
				
		return description;
	}

	public void report(String a, int b) {
//		System.out.println(a);
//		System.out.println(b);
		
		this.hand = a;
		this.highestValue = b;
	}
	
	
	public String getHand()
	{
		return this.hand;
	}
	
	public int getHighestValue()
	{
		return this.highestValue;
	}

}