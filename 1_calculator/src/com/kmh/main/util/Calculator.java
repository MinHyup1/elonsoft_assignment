package com.kmh.main.util;

import java.text.DecimalFormat;

public class Calculator {
	DecimalFormat df = new DecimalFormat("#,###.###"); 
	
	
	public String puls(double num_1, double num_2) {
		return df.format(num_1 + num_2);
	}
	
	public String minus(double num_1, double num_2) {
		return df.format(num_1 - num_2);
	}
	
	public String multiply(double num_1, double num_2) {
		return df.format(num_1 * num_2);
	}
	
	public String divide(double num_1, double num_2) {
		return df.format(num_1 / num_2);
	}
}
