/*
 * This is an exercise from Java for Dummies, 7th Edition
 *
 * This program takes user input to tell them how many days in a given month
 *
 */
package months;

/**
 *
 * @author bunglenutter
 */

import javax.swing.JOptionPane; //Need this for input windows

public class Months { //Name of main class

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	String month = JOptionPane.showInputDialog("Which month?"); //Bring up initial input window
	
	month = month.toLowerCase(); //Accommodate caps or not
	
	//Go through each possibility and respond accordingly
	switch(month) {
	    case "january":
		JOptionPane.showMessageDialog(null, "31 days");
		break;
	    case "february":
		//Will need to check if it's a leap year
		int leap = JOptionPane.showConfirmDialog(null, "Is it a leap year?",
			    null, JOptionPane.YES_NO_OPTION);
		
		//Respond accordingly
		if (leap == JOptionPane.YES_OPTION) {
		    JOptionPane.showMessageDialog(null, "29 days");
		} else {
		    JOptionPane.showMessageDialog(null, "28 days");
		}
		break;
	    case "march":
		JOptionPane.showMessageDialog(null, "31 days");
		break;
	    case "april":
		JOptionPane.showMessageDialog(null, "30 days");
		break;
	    case "may":
		JOptionPane.showMessageDialog(null, "31 days");
		break;
	    case "june":
		JOptionPane.showMessageDialog(null, "30 days");
		break;
	    case "july":
		JOptionPane.showMessageDialog(null, "31 days");
		break;
	    case "august":
		JOptionPane.showMessageDialog(null, "31 days");
		break;
	    case "september":
		JOptionPane.showMessageDialog(null, "30 days");
		break;
	    case "october":
		JOptionPane.showMessageDialog(null, "31 days");
		break;
	    case "november":
		JOptionPane.showMessageDialog(null, "30 days");
		break;
	    case "december":
		JOptionPane.showMessageDialog(null, "31 days");
		break;
	    default:
		JOptionPane.showMessageDialog(null, "That's not a month!");
		break;
		    
	}
    }
    
}
