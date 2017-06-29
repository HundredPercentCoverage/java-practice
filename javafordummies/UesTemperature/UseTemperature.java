package usetemperature;

//Main class that makes use of the Temperature class and subclasses
//Java for Dummies, chapter 9

public class UseTemperature {

    public static void main(String[] args) {
	TemperatureEvenNicer temp = new TemperatureEvenNicer();
	temp.setNumber(70.1);
	temp.setScale(TempScale.CELSIUS);
	temp.display();
	temp.convertTo(TempScale.FAHRENHEIT);
	temp.display();
	
	temp = new TemperatureEvenNicer(32.0);
	temp.display();
	
	temp = new TemperatureEvenNicer(TempScale.FAHRENHEIT);
	temp.display();
	
	temp = new TemperatureEvenNicer(2.73, TempScale.KELVIN);
	temp.display();
	temp.convertTo(TempScale.CELSIUS); //Shouldn't convert
	temp.display();
	
    }
    
}
