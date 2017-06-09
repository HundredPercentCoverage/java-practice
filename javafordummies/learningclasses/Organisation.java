package useorganisations;

import static java.lang.System.out;

//Individual organisation class, used by UseOrganisations
public class Organisation {
    private String name;	//Private to restrict access
    private int revenue;
    private boolean forProfit;

    
    public void display() {				//Method to show info
	out.println("Account name: " + name);
	out.println("Revenue: £" + revenue);
	if (forProfit) {
	    out.println("Business is for profit.");
	} else {
	    out.println("Business is not for profit.");
	}
    }
    
    //Getters and setters below
    public void setName(String in) {
	if(!in.equals("")){	    
	    name = in;
	}
    }
    
    public String getName() {
	return name;
    }
    
    public void setRevenue(int rev) {
	if(rev > 0) {
	    revenue = rev;
	}
    }
    
    public int getRevenue() {
	return revenue;
    }
    
    public void setForProfit(boolean prof) {
	forProfit = prof;
    }
    
    //Class method to get tax based on revenue
    public double getTax() {
	double tax;
	if (forProfit) {
	    tax = revenue * 0.1;
	} else {
	    tax = revenue * 0.02;
	}
	return tax;
    }
}
