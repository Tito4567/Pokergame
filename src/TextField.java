import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TextField extends JPanel implements ActionListener {
	
	JTextField field;
	//JTextArea fieldII;
	
	
	int u = 0;
	public String value = null;
	TextField()
	{
		// Below is the testing for straight flush
		Card a = new Card('c',1);
		Card b = new Card('h',1);
		Card c = new Card('c',3);
		Card d = new Card('h',5);
		Card e = new Card('c',5);
		Card[] bb = new Card[]{a,b,c,d,e};
		setLayout(new FlowLayout());
	//	fieldII = new JTextArea();
		field = new JTextField(50);
		//fieldII.setText("Testing");
	  //  add(fieldII);
		//add(field);
	    
		
		
			Handtest g = new Handtest();
			Player white = new Player();
			//boolean loop = true;
								
			white.preter(g.fullHouse(bb), g); 
//			System.out.println(loop+" for Full House");
			
			white.preter(g.twoPairs(bb), g);
//			System.out.println(loop+" for two pairs");			
			
			white.preter(g.straightFlushTest(bb), g); 
//			System.out.println(loop+" for straight Flush");
			
			white.preter(g.straight(bb),g); 
//			System.out.println(loop+" for straight");
			
			white.preter(g.pair(bb),g);
//			System.out.println(loop+" for pair");
			
			white.preter(g.fourOfAKind(bb),g);
//			System.out.println(loop+" for four of a kind");
			
			white.preter(g.threeOfAKind(bb),g);
//			System.out.println(loop+" for three of a kind");
			
			white.preter(g.flush(bb),g);
//			System.out.println(loop+" for flush");
			
			white.preter(g.highCard(bb),g);
			//System.out.println(loop+" for High Card");
			
			System.out.println(white.getHandNumbered());
			
			
			ArrayList<Card> Stack = new ArrayList<Card>();
		
			//Spades
			for(int j = 2; j < 15; j++)
			{
				Stack.add(new Card('s',j));
			}
			
			//diamonds
			for(int j = 2; j < 15; j++)
			{
				Stack.add(new Card('d',j));
			}
			
			//clubs
			for(int j = 2; j < 15; j++)
			{
				Stack.add(new Card('c',j));
			}
			
			//hearts
			for(int j = 2; j < 15; j++)
			{
				Stack.add(new Card('h',j));
			}		
		
			
			Collections.shuffle(Stack);
			
			
			Card[] array = Stack.toArray(new Card[Stack.size()]);
			Card[] black = new Card[5];
			
			for (int i = 0; i < 5; i++)
			{
				black[i] = array[i];
			}
			
//			loop = g.fullHouse(black); 
//			System.out.println(loop+" for Full House");
//			
//			loop = g.twoPairs(black);
//			System.out.println(loop+" for two pairs");			
//			
//			loop = g.straightFlushTest(black); 
//			System.out.println(loop+" for straight Flush");
//			
//			loop = g.straight(black); 
//			System.out.println(loop+" for straight");
//			
//			loop = g.pair(black);
//			System.out.println(loop+" for pair");
//			
//			loop = g.fourOfAKind(black);
//			System.out.println(loop+" for four of a kind");
//			
//			loop = g.threeOfAKind(black);
//			System.out.println(loop+" for three of a kind");
//			
//			loop = g.flush(black);
//			System.out.println(loop+" for flush");
//			
//			loop = g.highCard(black);
//			System.out.println(loop+" for High Card");
//			
//			
//			System.out.println(black[0]+" "+black[1]+" "+black[2]+" "+black[3]+" "+black[4]);
				
			JButton butt = new JButton("Enter here");
			butt.addActionListener(this);
			add(butt);

}
	
	

	@Override
	public void actionPerformed(ActionEvent e)
	{		
		
	}
	
	protected void paintComponent(Graphics g)
	{
		
		g.drawString(field.getText(), 30, 30);
	}
	
	public void forText(String t)
	{
		this.value = t;
		field.setText(t);
	}

	//protected void paintComponent(Graphics g) {}
	

}