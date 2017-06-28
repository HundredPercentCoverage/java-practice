//Playing with enums and constructors

package useflights;

import java.time.LocalTime;
import static java.lang.System.out;

public class UseFlights {

    public static void main(String[] args) {
	AirplaneFlight flight;
	
	//Construct with base numbers
	flight = new AirplaneFlight();
	
	out.println("Flight number: " + flight.getFlightNum());
	out.println("Flight departing from: " + flight.getDeparturePort());
	out.println("Departing at: " + flight.getDepartureTime());
	out.println("Arriving at: " + flight.getArrivalTime());
	out.println("Arriving to: " + flight.getArrivalPort());
	out.println();
	
	//Construct with specific parameters
	flight = new AirplaneFlight(LocalTime.of(1, 40), LocalTime.now());
	flight.setArrivalPort(Airport.LHR);
	flight.setFlightNum(43);
	
	out.println("Flight number: " + flight.getFlightNum());
	out.println("Flight departing from: " + flight.getDeparturePort());
	out.println("Departing at: " + flight.getDepartureTime());
	out.println("Arriving at: " + flight.getArrivalTime());
	out.println("Arriving to: " + flight.getArrivalPort());
	out.println();
    }
    
}
