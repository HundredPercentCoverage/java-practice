import java.util.Scanner;
import static java.lang.System.out;
import java.io.File;
import java.io.IOException;

public class DisplayThePlaces {

    public static void main(String[] args) throws IOException {
	Scanner diskScanner = new Scanner(new File("Places.txt")); 	//Opens a file called Places.txt
	
	for(int i = 0; i < 3; i++){					//Assume 3 items in file
	    display(diskScanner);					//Show info from each
	}
	
	diskScanner.close();						//Cleanup
    }
    
    static void display(Scanner aScanner) {
	PlaceToLive place = new PlaceToLive();				//New object to hold info
	
	place.setAddress(aScanner.nextLine());				//Get relevant info from file
	place.setArea(aScanner.nextDouble());
	aScanner.nextLine();
	place.setBedrooms(aScanner.nextInt());
	aScanner.nextLine();
	
	out.println("Address: " + place.getAddress());			//Display the info
	out.printf("Number of bedrooms: %d\n", place.getBedrooms());
	out.printf("Area: %.2f\n", place.getArea());
    }
    
}
