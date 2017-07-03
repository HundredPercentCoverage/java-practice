package showcards;

//Base playing card class
public class PlayingCard {
    private int number; //Card value, 11 is Jack, 12 is Queen, 13 is King
    private Suits suit;
    
    public PlayingCard(int number, Suits suit) {
	this.number = number;
	this.suit = suit;
    }
    
    //Getters
    public Suits getSuit() {
	return suit;
    }
    
    public int getNumber() {
	return number;
    }
}
