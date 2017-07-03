package showcards;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.GridLayout;

//Frame class to display cards
public class CardsFrame extends JFrame {
    public CardsFrame() {
	PlayingCard card;
	String name;
	
	//Make sure each card is checked to get names of face cards
	card = new PlayingCard(10, Suits.CLUBS);
	name = check(card);
	add(new JLabel(name + " of " + card.getSuit().toString()));
	
	card = new PlayingCard(13, Suits.DIAMONDS);
	name = check(card);
	add(new JLabel(name + " of " + card.getSuit().toString()));
	
	card = new PlayingCard(5, Suits.SPADES);
	name = check(card);
	add(new JLabel(name + " of " + card.getSuit().toString()));
	
	card = new PlayingCard(2, Suits.HEARTS);
	name = check(card);
	add(new JLabel(name + " of " + card.getSuit().toString()));
	
	//Put everything together
	setTitle("Playing Cards");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setLayout(new GridLayout(4, 1, 0, 3));
	pack();
	setVisible(true);
    }
    
    //Method to return card values including face cards
    public String check(PlayingCard card) {
	String name;
	
	if(card.getNumber() > 10) {	//If face card
	    switch(card.getNumber()){	//Check value and return correct name
		case 11:
		    name = "Jack";
		    break;
		case 12:
		    name = "Queen";
		    break;
		case 13:
		    name = "King";
		    break;
		default:
		    name = "INVALID";
		    break;
	    }
	} else {
	    name = String.valueOf(card.getNumber()); //Otherwise return number
	}
	
	return name;
    }
}
