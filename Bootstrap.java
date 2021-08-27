import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JFrame;
import javax.swing.*;

public class Bootstrap extends JFrame{
	
	TextField interfce = null;
	//JTextArea interfceII = null;

	public static void main(String[] args) throws InterruptedException {
		
	
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
		Card a = new Card('c', 1);
		Card b = new Card('h', 1);
		Card c = new Card('c', 3);
		Card d = new Card('h', 5);
		Card e = new Card('c', 5);
		Card[] bb = new Card[] { a, b, c, d, e };
		
				

		// Handtest g = new Handtest();
		Handtest h = new Handtest();
		Player white = new Player();
		Player black = new Player();
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

		for (int z = 0; z < 100; z++) {

			Thread.sleep(3000);

			Collections.shuffle(Stack);

			Card[] array = Stack.toArray(new Card[Stack.size()]);
			Card[] blck = new Card[5];
			Card[] whte = new Card[5];

			for (int i = 0; i < 5; i++) {
				blck[i] = array[i];

			}

			for (int i = 5; i < 10; i++) {
				whte[(i - 5)] = array[i];
			}

			white.preter(h.fullHouse(whte), h);
			white.preter(h.twoPairs(whte), h);
			white.preter(h.straightFlushTest(whte), h);
			white.preter(h.straight(whte), h);
			white.preter(h.pair(whte), h);
			white.preter(h.fourOfAKind(whte), h);
			white.preter(h.threeOfAKind(whte), h);
			white.preter(h.flush(whte), h);
			white.preter(h.highCard(whte), h);

			black.preter(h.fullHouse(blck), h);
			black.preter(h.twoPairs(blck), h);
			black.preter(h.straightFlushTest(blck), h);
			black.preter(h.straight(blck), h);
			black.preter(h.pair(blck), h);
			black.preter(h.fourOfAKind(blck), h);
			black.preter(h.threeOfAKind(blck), h);
			black.preter(h.flush(blck), h);
			black.preter(h.highCard(blck), h);

			//System.out.println("Black: " + blck[0] + " " + blck[1] + " " + blck[2] + " " + blck[3] + " " + blck[4]);
			// interfce
			//System.out.println("White: " + whte[0] + " " + whte[1] + " " + whte[2] + " " + whte[3] + " " + whte[4]);
	//		setTextField("Black: " + blck[0] + " " + blck[1] + " " + blck[2] + " " + blck[3] + " " + blck[4]);
			
			
			

//			System.out.println(black.getHandNumbered());
//			System.out.println(white.getHandNumbered());

			if (black.getHandNumbered() > white.getHandNumbered()) {
				int i = 0;
				System.out.println("Black wins");
				i = black.getHandNumbered();
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

			else if (black.getHandNumbered() < white.getHandNumbered()) {
				int i = 0;
				System.out.println("White wins");
				interfce.forText("White wins");
				i = white.getHandNumbered();
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

			} else if (black.getHandNumbered() == white.getHandNumbered()) {
				int i = 0;
				i = white.getHandNumbered();
				switch (i) {
				case 1:
					System.out.println("High Card");
					interfce.forText("High Card");
					repaint();
					if (black.getValue() > white.getValue()) {
						System.out.println("Black wins");
					} else {
						System.out.println("White wins");
					}
					break;

				case 2:
					System.out.println("Pair");
					if (black.getValue() > white.getValue()) {
						System.out.println("Black wins");
					} else {
						System.out.println("White wins");
					}
					break;

				case 3:
					System.out.println("Two Pairs");
					interfce.forText("Two Pairs");
					repaint();
					if (black.getValue() > white.getValue()) {
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
