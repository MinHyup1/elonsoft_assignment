package com.kmh.main.util;

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;


public class InputOutput {
	Calculator calculator = new Calculator();
	DecimalFormat df = new DecimalFormat("#,###.###");
			
	public String getInput() {
		String result = "";
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("첫번째 숫자를 입력해 주세요 : ");
			double num_1 = sc.nextDouble();
			System.out.print("사칙연산 기호를 입력해 주세요 : ");
			String sign = sc.next().trim();
			System.out.print("두번째 숫자를 입력해 주세요 : ");
			double num_2 = sc.nextDouble();
			 
			result = doCalculateBySgin(num_1, sign, num_2);
		} catch (InputMismatchException e) {
			result = "[ ERROR ]  {숫자를 입력해 주세요}";
			return result;
		}
		return result;
	}
	
	
	



	private String doCalculateBySgin(double num_1, String sign, double num_2) {
		if(sign.equals("+")) {
			return df.format(num_1) + " " + sign + " " + df.format(num_2) + calculator.puls(num_1, num_2);
		}
		if(sign.equals("-")) {
			return df.format(num_1) + " " + sign + " " + df.format(num_2) + calculator.minus(num_1, num_2);
		}
		if(sign.equals("*")) {
			return df.format(num_1) + " " + sign + " " + df.format(num_2) + calculator.multiply(num_1, num_2);
		}
		if(sign.equals("/")) {
			return df.format(num_1) + " " + sign + " " + df.format(num_2) + calculator.divide(num_1, num_2);
		}
		return "[ ERROR ] {수식이 올바르지 않습니다}";
	}






	public void printResult(String result) {
		System.out.println(result);
		
		
	}

}
