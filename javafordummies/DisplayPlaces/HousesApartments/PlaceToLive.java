//Class describing basic properties of place to live
public class PlaceToLive {
    //Variables
    private String address;
    private int bedrooms;
    private double area;
    
    //Getters and setters
    public void setAddress(String inAddress) {
	address = inAddress;
    }
    
    public String getAddress() {
	return address;
    }
    
    public void setBedrooms(int inBeds) {
	bedrooms = inBeds;
    }
    
    public int getBedrooms() {
	return bedrooms;
    }
    
    public void setArea(double inArea) {
	area = inArea;
    }
    
    public double getArea() {
	return area;
    }
}
