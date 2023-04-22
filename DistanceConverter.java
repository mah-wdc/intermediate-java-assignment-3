/*
 * Matthew Homan
 * April 24, 2023
 * Assignment 3
 * CMIS 242 7382
 * 
 */

public class DistanceConverter extends Converter{

	//Constructors
	public DistanceConverter() {
		super();
	}

	public DistanceConverter(double input) {
		super(input);
	}

	//Override convert method
	@Override
	public double convert() {
	
		if (Double.isNaN(getInput())) {
			return Double.NaN;
		}
		
		return getInput() * 1.609;
	}

}
