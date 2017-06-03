/*
 * Number guessing game to illustrate while loop
 */
package loops;

/**
 *
 * @author bunglenutter
 */

import static java.lang.System.out;
import java.util.Scanner;
import java.util.Random;

public class Loops {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
	
	int numGuesses = 0;
	int randomNumber = new Random().nextInt(10) + 1;
	
	out.println("*********");
	out.println("Welcome to the guessing game");
	out.println("*********");
	out.println();
	
	out.print("Enter an int from 1 to 10: ");
	int inputNumber = keyboard.nextInt();
	numGuesses++;
	
	while (inputNumber != randomNumber) {
	    out.println();
	    out.println("Try again...");
	    out.print("Enter an int from 1 to 10: ");
	    inputNumber = keyboard.nextInt();
	    numGuesses++;
	}
	
	out.println("You win after " + numGuesses + " guesses");
	
	keyboard.close();
    }
    
}
