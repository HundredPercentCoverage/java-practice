//Aeroplane flight class that uses airport enum and LocalTime 

package useflights;

import java.time.LocalTime;

public class AirplaneFlight {
    //Variables
    private int flightNum;
    private Airport departurePort, arrivalPort;
    private LocalTime departureTime, arrivalTime;
    
    //Constructors
    public AirplaneFlight() {
	flightNum = 1;
	departurePort = Airport.BFI;
	arrivalPort = Airport.LAX;
	arrivalTime = LocalTime.now();
	departureTime = LocalTime.now();
    }
    
    public AirplaneFlight(LocalTime arrivalTime, LocalTime departureTime) {
	this.arrivalTime = arrivalTime;
	this.departureTime = departureTime;
	flightNum = 1;
	departurePort = Airport.BFI;
	arrivalPort = Airport.LAX;
    }
    
    //Getters and setters
    public void setFlightNum(int num) {
	flightNum = num;
    }
    
    public int getFlightNum() {
	return flightNum;
    }
    
    public void setDeparturePort(Airport airport) {
	departurePort = airport;
    }
    
    public Airport getDeparturePort() {
	return departurePort;
    }
    
    public void setArrivalPort(Airport airport) {
	arrivalPort = airport;
    }
    
    public Airport getArrivalPort() {
	return arrivalPort;
    }
    
    public void setDepartureTime(LocalTime time) {
	departureTime = time;
    }
    
    public LocalTime getDepartureTime() {
	return departureTime;
    }
    
    public void setArrivalTime(LocalTime time) {
	arrivalTime = time;
    }
    
    public LocalTime getArrivalTime() {
	return arrivalTime;
    }
    
}
