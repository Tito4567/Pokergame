//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JFrame;
//import javax.swing.*;

public class Bootstrap extends JFrame{
	
	TextField interfce = null;
	//JTextArea interfceII = null;

	public static void main(String[] args) throws InterruptedException 
	{	
	
		new Bootstrap();

	}
	
	
	public void setTextField(String t)
	{
		interfce.forText(t);
		
	}
	
	
	Bootstrap() throws InterruptedException
	{
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		interfce = new TextField();
		add(interfce);
		//add(interfceII);
		setVisible(true);
		setSize(500,500);
		
		// Below was passed from main method
//		Card a = new Card('c', 1);
//		Card b = new Card('h', 1);
//		Card c = new Card('c', 3);
//		Card d = new Card('h', 5);
//		Card e = new Card('c', 5);
//		Card[] bb = new Card[] { a, b, c, d, e };
		
				

		// Handtest g = new Handtest();
		Handtest h = new Handtest();
		// added 3/11/2023
		int playersize = 2;
		Player[] players = new Player[playersize];
		// stop
		// removed on 3/11/2023
		
		
		// added 3/11/2023
		for(int i = 0; i < 2; i++) 
		{
			players[i] = new Player();
		}
		// stop
		//		Player black = new Player();		
		//		Player white = new Player();
		//		Player black = new Player();
		//		stop
		boolean loop = true;

//			white.preter(g.fullHouse(bb), g); 
//			white.preter(g.twoPairs(bb), g);
//			white.preter(g.straightFlushTest(bb), g); 
//			white.preter(g.straight(bb),g); 
//			white.preter(g.pair(bb),g);
//			white.preter(g.fourOfAKind(bb),g);
//			white.preter(g.threeOfAKind(bb),g);
//			white.preter(g.flush(bb),g);
//			white.preter(g.highCard(bb),g);

		ArrayList<Card> Stack = new ArrayList<Card>();

		// Spades
		for (int j = 2; j < 15; j++) {
			Stack.add(new Card('s', j));
		}

		// diamonds
		for (int j = 2; j < 15; j++) {
			Stack.add(new Card('d', j));
		}

		// clubs
		for (int j = 2; j < 15; j++) {
			Stack.add(new Card('c', j));
		}

		// hearts
		for (int j = 2; j < 15; j++) {
			Stack.add(new Card('h', j));
		}

		//for loop below is used to iterate hands and play over and over
		for (int z = 0; z < 1000; z++) 
		{
			System.out.println(z+" "+"is iteration");

			Thread.sleep(3000);
			
			// below is used to shuffle the cards
			Collections.shuffle(Stack);
			
			// converts to ArrayList to Array
			
			
			// added 3/11/2023
			//Working on right now
			
			Card[] array = Stack.toArray(new Card[Stack.size()]);
			Card[][] blck = new Card[playersize][5];
			for (int j = 0; j < playersize; j++) 
			{
			
			//Card[] whte = new Card[5];
			
			// both for loops below distributes the cards below
			for (int i = 0; i < 5; i++) {
				blck[1][i] = array[i];

			}

			for (int i = 5; i < 10; i++) {
				blck[0][(i - 5)] = array[i];
			}
			
			
			// removed on 3/11/2023
//			white.preter(h.fullHouse(whte), h);
//			white.preter(h.twoPairs(whte), h);
//			white.preter(h.straightFlushTest(whte), h);
//			white.preter(h.straight(whte), h);
//			white.preter(h.pair(whte), h);
//			white.preter(h.fourOfAKind(whte), h);
//			white.preter(h.threeOfAKind(whte), h);
//			white.preter(h.flush(whte), h);
//			white.preter(h.highCard(whte), h);
//
//			black.preter(h.fullHouse(blck), h);
//			black.preter(h.twoPairs(blck), h);
//			black.preter(h.straightFlushTest(blck), h);
//			black.preter(h.straight(blck), h);
//			black.preter(h.pair(blck), h);
//			black.preter(h.fourOfAKind(blck), h);
//			black.preter(h.threeOfAKind(blck), h);
//			black.preter(h.flush(blck), h);
//			black.preter(h.highCard(blck), h);
			// stop

			// added on 3/11/2023
			players[0].preter(h.fullHouse(blck[0]), h);
			players[0].preter(h.twoPairs(blck[0]), h);
			players[0].preter(h.straightFlushTest(blck[0]), h);
			players[0].preter(h.straight(blck[0]), h);
			players[0].preter(h.pair(blck[0]), h);
			players[0].preter(h.fourOfAKind(blck[0]), h);
			players[0].preter(h.threeOfAKind(blck[0]), h);
			players[0].preter(h.flush(blck[0]), h);
			players[0].preter(h.highCard(blck[0]), h);

			players[1].preter(h.fullHouse(blck[1]), h);
			players[1].preter(h.twoPairs(blck[1]), h);
			players[1].preter(h.straightFlushTest(blck[1]), h);
			players[1].preter(h.straight(blck[1]), h);
			players[1].preter(h.pair(blck[1]), h);
			players[1].preter(h.fourOfAKind(blck[1]), h);
			players[1].preter(h.threeOfAKind(blck[1]), h);
			players[1].preter(h.flush(blck[1]), h);
			players[1].preter(h.highCard(blck[1]), h);
			}
			// stop
			
			
			
			//System.out.println("Black: " + blck[0] + " " + blck[1] + " " + blck[2] + " " + blck[3] + " " + blck[4]);
			// interfce
			//System.out.println("White: " + whte[0] + " " + whte[1] + " " + whte[2] + " " + whte[3] + " " + whte[4]);
	//		setTextField("Black: " + blck[0] + " " + blck[1] + " " + blck[2] + " " + blck[3] + " " + blck[4]);
			
			
			

//			System.out.println(black.getHandNumbered());
//			System.out.println(white.getHandNumbered());

			if (players[1].getHandNumbered() > players[0].getHandNumbered()) {
				int i = 0;
				System.out.println("Black wins");
				i = players[1].getHandNumbered();
				switch (i) {
				case 1:
					System.out.println("High Card");
					interfce.forText("High Card");
					repaint();
					break;

				case 2:
					 System.out.println("Pair");
					interfce.forText("Pair");
					repaint();
					break;

				case 3:
					 System.out.println("Two Pairs");
					interfce.forText("Two Pairs");
					repaint();
					break;

				case 4:
					System.out.println("Three of a kind");
					interfce.forText("Three of a kind");
					repaint();
					break;

				case 5:
					System.out.println("Straight");
					interfce.forText("Straight");
					repaint();
					break;

				case 6:
					System.out.println("Flush");
					interfce.forText("Flush");
					repaint();
					break;

				case 7:
					System.out.println("Full Hose");
					interfce.forText("Full House");
					repaint();
					break;

				case 8:
					System.out.println("Four of a kind");
					interfce.forText("Four of a kind");
					repaint();
					break;

				case 9:
					System.out.println("Straight Flush");
					interfce.forText("Straight Flush");
					repaint();
					break;
				}
			}

			else if (players[1].getHandNumbered() < players[0].getHandNumbered()) {
				int i = 0;
				System.out.println("White wins");
				interfce.forText("White wins");
				i = players[0].getHandNumbered();
				switch (i) {
				case 1:
					System.out.println("High Card");
					interfce.forText("High Card");
					repaint();
					break;

				case 2:
					System.out.println("Pair");
					interfce.forText("Pair");
					repaint();
					break;

				case 3:
					System.out.println("Two Pairs");
					interfce.forText("Two Pairs");
					repaint();
					break;

				case 4:
					System.out.println("Three of a kind");
					interfce.forText("Three of a kind");
					repaint();
					break;

				case 5:
					System.out.println("Straight");
					interfce.forText("Straight");
					repaint();
					break;

				case 6:
					System.out.println("Flush");
					interfce.forText("Flush");
					repaint();
					break;

				case 7:
					System.out.println("Full Hose");
					interfce.forText("Full House");
					repaint();
					break;

				case 8:
					System.out.println("Four of a kind");
					interfce.forText("Four of a kind");
					repaint();
					break;

				case 9:
					System.out.println("Straight Flush");
					interfce.forText("Straight Flush");
					repaint();
					break;
				}

			} else if (players[1].getHandNumbered() == players[0].getHandNumbered()) {
				int i = 0;
				i = players[0].getHandNumbered();
				switch (i) {
				case 1:
					System.out.println("High Card");
					interfce.forText("High Card");
					repaint();
					if (players[1].getValue() > players[0].getValue()) {
						System.out.println("Black wins");
					} else {
						System.out.println("White wins");
					}
					break;

				case 2:
					System.out.println("Pair");
					if (players[1].getValue() > players[0].getValue()) {
						System.out.println("Black wins");
					} else {
						System.out.println("White wins");
					}
					break;

				case 3:
					System.out.println("Two Pairs");
					interfce.forText("Two Pairs");
					repaint();
					if (players[1].getValue() > players[0].getValue()) {
						System.out.println("Black wins");
					} else {
						System.out.println("White wins");
					}
					break;

				case 4:
					System.out.println("Three of a kind");
					interfce.forText("Three of a kind");
					repaint();
					break;

				case 5:
					System.out.println("Straight");
					interfce.forText("Straight");
					repaint();
					break;

				case 6:
					System.out.println("Flush");
					interfce.forText("Flush");
					repaint();
					break;

				case 7:
					System.out.println("Full Hose");
					interfce.forText("Full House");
					repaint();
					break;

				case 8:
					System.out.println("Four of a kind");
					interfce.forText("Four of a kind");
					repaint();
					break;

				case 9:
					System.out.println("Straight Flush");
					interfce.forText("Straight Flush");
					repaint();
					break;
				}

			}
			// SpaceSystem.out.println(" ");
			System.out.println(" ");
			System.out.println(" ");
			
		}
		
		
		
	}
	
	

}