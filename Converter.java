/*
 * Matthew Homan
 * April 24, 2023
 * Assignment 3
 * CMIS 242 7382
 * 
 */

public class Converter {

	//Initialize attributes
	private double input;

	//Constructors
	public Converter() {
		this.input = Double.NaN;
	}
	
	public Converter(double input) {
		this.input = input;
	}

	//Getters and Setters
	public double getInput() {
		return input;
	}

	public void setInput(double input) {
		this.input = input;
	}
	
	//default convert method
	public double convert() {
		return input;
	}
}
