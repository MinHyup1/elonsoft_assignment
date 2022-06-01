package com.kmh.util;

import java.util.Scanner;

public class InputOutput {
	Calculator calculator = new Calculator();

	public double input() {
		 Scanner sc = new Scanner(System.in);
		 String input = sc.next();
		 double result;
		 
		 result = calculator.calculate(input);
		 
	     return result;
	}
	
	public void printResult(double result) {
		
		System.out.println(result);
	}

}
