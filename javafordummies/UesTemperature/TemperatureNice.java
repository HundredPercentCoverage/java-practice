package usetemperature;

import static java.lang.System.out;

//Subclass of Temperature that includes a display() method
public class TemperatureNice extends Temperature {
    public TemperatureNice() {
	super();
    }
    
    public TemperatureNice(double number) {
	super(number);
    }
    
    public TemperatureNice(TempScale scale) {
	super(scale);
    }
    
    public TemperatureNice(double number, TempScale scale) {
	super(number, scale);
    }
    
    public void display() {
	out.printf("%5.2f degrees %s\n", getNumber(), getScale());
    }
}
