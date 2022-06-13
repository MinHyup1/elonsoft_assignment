package com.kmh.main.util;


public class Calculator {
	
	
	public String puls(double num_1, double num_2) {
		return InputOutput.df.format(num_1 + num_2);
	}
	
	public String minus(double num_1, double num_2) {
		return InputOutput.df.format(num_1 - num_2);
	}
	
	public String multiply(double num_1, double num_2) {
		return InputOutput.df.format(num_1 * num_2);
	}
	
	public String divide(double num_1, double num_2) {
		return InputOutput.df.format(num_1 / num_2);
	}
}
