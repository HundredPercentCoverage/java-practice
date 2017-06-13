import java.util.Scanner;
import static java.lang.System.out;

public class DisplayThePlaces {

    public static void main(String[] args) {
	PlaceToLive one, two, three;
	
	one = new PlaceToLive();
	one.setAddress("5 Carrickburn Road");
	one.setBedrooms(4);
	one.setArea(100.67);
	
	two = new PlaceToLive();
	two.setAddress("22 Lisbane Gardens");
	two.setBedrooms(3);
	two.setArea(54.76);
	
	three = new PlaceToLive();
	three.setAddress("9 Jordanstown Mews");
	three.setBedrooms(2);
	three.setArea(32.65);
	
	display(one);
	display(two);
	display(three);
	
    }
    
    static void display(PlaceToLive place) {
	Scanner keyboard = new Scanner(System.in);
	
	out.println("Address: " + place.getAddress());
	out.println("Number of bedrooms: " + place.getBedrooms());
	out.println("Area in square metres: " + place.getArea());
	
	out.print("Please enter the cost for the property: £");
	double totalCost = keyboard.nextDouble();
	
	double perSqM = totalCost / place.getArea();
	double perRoom = totalCost / place.getBedrooms();
	
	out.printf("The cost per square metre is: £%,.2f\n", perSqM);
	out.printf("The cost per room is: £%,.2f\n\n", perRoom);
    }
}
