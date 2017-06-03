/*
 * Prints factorial of given int
 */

import java.util.Scanner;
import static java.lang.System.out;

public class Factorials {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);  //Input device
	
	out.print("Please enter factorial: ");	    //Request input
	int n = keyboard.nextInt();		    //Assign input to n (will throw exception if not int)
	int result = 1;				    //Factorials start with 1
	
	for (int i = 1; i <= n; i++) {		    //Loop through each int to n
	    result *= i;			    //Multiply last answer by next
	}
	
	out.println("Result is: " + result);	    //Print result
    }
    
}
