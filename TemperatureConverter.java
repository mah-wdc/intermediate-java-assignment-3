/*
 * Matthew Homan
 * April 24, 2023
 * Assignment 3
 * CMIS 242 7382
 * 
 */

public class TemperatureConverter extends Converter {

	//Constructors
	public TemperatureConverter() {
		super();
	}

	public TemperatureConverter(double input) {
		super(input);
	}
	
	//Override convert method
	@Override
	public double convert() {
	
		if (Double.isNaN(getInput())) {
			return Double.NaN;
		}
		
		return ((getInput() - 32) * 5) / 9;
	}

}
