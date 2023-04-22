/*
 * Matthew Homan
 * April 24, 2023
 * Assignment 3
 * CMIS 242 7382
 * 
 * This program creates an interactive window with 2 buttons to prompt a user to 
 * convert miles to kilometers and fahrenheit to celcius.  When a user is finished
 * using the program, there is an exit button on the bottom which will close the 
 * program.
 * 
 */

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GUIConverter {

	public static void main(String[] args) {

		//Create JFrame, JPanel, and 3 JButton objects
		JFrame frame = new JFrame("Welcome to Converter");
		JPanel panel = new JPanel();
		JButton distanceButton = new JButton("Distance Converter");
		JButton temperatureButton = new JButton("Temperature Converter");
		JButton exitButton = new JButton("Exit");
		
		//Panel - set layout and add buttons to correct regions
		panel.setLayout(new BorderLayout());
		panel.add(distanceButton, BorderLayout.WEST);
		panel.add(temperatureButton, BorderLayout.EAST);
		panel.add(exitButton, BorderLayout.SOUTH);
		
		//Frame - add panel, size, visibility, and close operation
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(350, 350);
		frame.setVisible(true);
		
		//distanceButton operation
		distanceButton.addActionListener(e -> {
			
			String inputStr = JOptionPane.showInputDialog(frame, "Input miles distance to convert");
			
			//if statement to check that a value is present
			if ((inputStr != null) && (!inputStr.isEmpty())) {
				
				//parse to double from string
				double input = Double.parseDouble(inputStr);
				
				//new DistanceConverter object
				DistanceConverter converter = new DistanceConverter(input);
				
				//Call convert method
				double answer = converter.convert();
				
				//show message dialog
				JOptionPane.showMessageDialog(frame,input + " Miles equals " + answer + " Kilometers");
			}
		});
		
		//temperatureButton operation
		temperatureButton.addActionListener(e -> {
			
			String inputStr = JOptionPane.showInputDialog(frame, "Input fahrenheit temperature to conver");
			
			//if statement to check that a value is present
			if ((inputStr != null) && (!inputStr.isEmpty())) {
				
				//parse to double from string
				double input = Double.parseDouble(inputStr);
				
				//new TemperatureConverter object
				TemperatureConverter converter = new TemperatureConverter(input);
				
				//Call convert method
				double answer = converter.convert();
				
				//show message dialog
				JOptionPane.showMessageDialog(frame,input + " F equals " + answer + " C");
			}
		});
		
		//exitButton operation
		exitButton.addActionListener(e ->  System.exit(0));

	}

}