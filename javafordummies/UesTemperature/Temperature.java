package usetemperature;

//Base temperature class - chapter 9 of Java for Dummies
public class Temperature {
    //Variables
    private double number;
    private TempScale scale; //Refer to enum
    
    //Constructors
    public Temperature() {
	number = 0.0;
	scale = TempScale.CELSIUS;
    }
    
    public Temperature(double number) {
	this.number = number;
	scale = TempScale.CELSIUS;
    }
    
    public Temperature(TempScale scale) {
	number = 0.0;
	this.scale = scale;
    }
    
    public Temperature(double number, TempScale scale) {
	this.number = number;
	this.scale = scale;
    }
    
    //Getters and setters
    public void setNumber(double number) {
	this.number = number;
    }
    
    public double getNumber() {
	return number;
    }
    
    public void setScale(TempScale scale) {
	this.scale = scale;
    }
    
    public TempScale getScale() {
	return scale;
    }
}
