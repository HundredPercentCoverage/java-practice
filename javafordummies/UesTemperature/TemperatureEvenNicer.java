package usetemperature;

//A subclass of the TemperatureNice subclass that now includes a conversion method

public class TemperatureEvenNicer extends TemperatureNice {
    //Constructors
    public TemperatureEvenNicer() {
	super();
    }
    
    public TemperatureEvenNicer(double number) {
	super(number);
    }
    
    public TemperatureEvenNicer(TempScale scale) {
	super(scale);
    }
    
    public TemperatureEvenNicer(double number, TempScale scale) {
	super(number, scale);
    }
    
    public void convertTo(TempScale scale) {
	//Only convert celsius or fahrenheit
	if (getScale() == TempScale.CELSIUS || getScale() == TempScale.FAHRENHEIT) {
	    //Don't convert if scales match
	    if (this.getScale() != scale) {
		//Do conversions as per scale
		switch (scale) {
		    case FAHRENHEIT:
			setScale(TempScale.FAHRENHEIT);
			setNumber(((getNumber() * 9.0) / 5.0) + 32.0);
			break;
		    case CELSIUS:
			setScale(TempScale.CELSIUS);
			setNumber(((getNumber() - 32.0) * 5.0 ) / 9.0);
			break;
		    default:
			//Do nothing
			break;
		}
	    }
	}
    }
}
