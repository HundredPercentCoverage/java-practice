/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loops;

/**
 *
 * @author bunglenutter
 */

import java.util.Scanner;
import static java.lang.System.out;

public class Loops {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);  //Input device
	
	out.print("Please enter factorial: ");	    //Request input
	int n = keyboard.nextInt();		    //Assign input to n
	int result = 1;				    //Factorials start with 1
	
	for (int i = 1; i <= n; i++) {		    //Loop through each int to n
	    result *= i;			    //Multiply last answer by next
	}
	
	out.println("Result is: " + result);	    //Print result
    }
    
}
