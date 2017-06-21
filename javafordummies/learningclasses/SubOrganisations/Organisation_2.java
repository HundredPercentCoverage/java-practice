package useorganisations;

//Basic Organisation class which will be subclassed
public class Organisation_2 {
    private String organisationName;
    private double revenue;
    
    //Getters and setters
    public void setName(String name) {
	organisationName = name;
    }
    
    public String getName() {
	return organisationName;
    }
    
    public void setRevenue(double inRevenue) {
	revenue = inRevenue;
    }
    
    public double getRevenue() {
	return revenue;
    }
}
