//Subclass of PlaceToLive
public class House extends PlaceToLive {
    private double mortgage, propertyTax;
    
    //Getters and setters
    public void setMortgage(double in) {
	mortgage = in;
    }
    
    public double getMortgage() {
	return mortgage;
    }
    
    public void setPropertyTax(double in) {
	propertyTax = in;
    }
    
    public double getPropertyTax() {
	return propertyTax;
    }
}
