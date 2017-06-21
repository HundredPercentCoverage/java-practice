//Subclass of PlaceToLive
public class Apartment extends PlaceToLive {
    private double rent;
    
    //Getters and setters
    public void setRent(double in) {
	rent = in;
    }
    
    public double getRent() {
	return rent;
    }
}
