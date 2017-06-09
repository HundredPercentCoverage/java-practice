//Investigating class methods, getters and setters, private fields etc.

package useorganisations;

import static java.lang.System.out;

//This class creates several instances of the Organisation class
public class UseOrganisations {

    public static void main(String[] args) {
	Organisation orgOne, orgTwo, orgThree;	//Organisations
	
	orgOne = new Organisation();		//Instantiate
	orgTwo = new Organisation();
	orgThree = new Organisation();
	
	orgOne.setName("One");			//Set the details of each
	orgOne.setRevenue(100000);
	orgOne.setForProfit(true);
	
	orgTwo.setName("Two");
	orgTwo.setRevenue(1000);
	orgTwo.setForProfit(false);
	
	orgThree.setName("Three");
	orgThree.setRevenue(70);
	orgThree.setForProfit(true);
	
	//Class method to display info called on each, tax also displayed
	orgOne.display();
	out.printf("Tax: £%.2f\n", orgOne.getTax());
	out.println();
	
	orgTwo.display();
	out.printf("Tax: £%.2f\n", orgTwo.getTax());
	out.println();
	
	orgThree.display();
	out.printf("Tax: £%.2f\n", orgThree.getTax());
	out.println();
    }
    
}
