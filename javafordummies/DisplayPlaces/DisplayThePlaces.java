import java.util.Scanner;
import static java.lang.System.out;
import java.io.File;
import java.io.IOException;

public class DisplayThePlaces {

    public static void main(String[] args) throws IOException {
	Scanner diskScanner = new Scanner(new File("Places.txt"));
	
	for(int i = 0; i < 3; i++){
	    display(diskScanner);
	}
	
	diskScanner.close();
    }
    
    static void display(Scanner aScanner) {
	PlaceToLive place = new PlaceToLive();
	
	place.setAddress(aScanner.nextLine());
	place.setArea(aScanner.nextDouble());
	aScanner.nextLine();
	place.setBedrooms(aScanner.nextInt());
	aScanner.nextLine();
	
	out.println("Address: " + place.getAddress());
	out.printf("Number of bedrooms: %d\n", place.getBedrooms());
	out.printf("Area: %.2f\n", place.getArea());
    }
    
}
