import static java.lang.System.out;

public class DisplayThePlaces {

    public static void main(String[] args) {
	House house;
	Apartment apartment;
	
	//Create and populate house
	house = new House();
	
	house.setAddress("22 Pleb Avenue");
	house.setBedrooms(3);
	house.setArea(1500);
	house.setMortgage(456.93);
	house.setPropertyTax(125.63);
	
	//Create and populate apartment
	apartment = new Apartment();
	
	apartment.setAddress("9 Bloggs Road");
	apartment.setArea(150.5);
	apartment.setBedrooms(2);
	apartment.setRent(500);
	
	//Display information
	out.println(house.getAddress() + " is " + 
		(house.getMortgage() / house.getArea()) + 
		" per sq. m per month.");
	
	out.println(house.getAddress() + " is " + 
		(house.getMortgage() / house.getBedrooms()) + 
		" per room per month.");
	
	out.println(apartment.getAddress() + " is " +
		(apartment.getRent() / apartment.getArea()) + 
		" per sq. m per month.");
	
	out.println(apartment.getAddress() + " is " + 
		(apartment.getRent() / apartment.getBedrooms()) + 
		" per room per month.");
    }
}
