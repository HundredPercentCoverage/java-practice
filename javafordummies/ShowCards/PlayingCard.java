package showcards;

//Base playing card class
public class PlayingCard {
    private int number; //Card value, 11 is Jack, 12 is Queen, 13 is King
    private Suits suit;
    
    private static int numCards = 0; //Static applies to whole class
    
    public PlayingCard(int number, Suits suit) {
	this.number = number;
	this.suit = suit;
	
	numCards++; //Increase no. of cards by 1
    }
    
    //Getters
    public Suits getSuit() {
	return suit;
    }
    
    public int getNumber() {
	return number;
    }
    
    //Static method to get number of cards
    public static String getNumCards() {
	return String.valueOf(numCards);
    }
}
