package com.kmh.main.util;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;


public class InputOutput {
	Calculator calculator = new Calculator();
	public static DecimalFormat df = new DecimalFormat("#,###.###");
	public static final String ANSI_RED = "\u001B[31m";
	public static final String TEXT_RESET = "\u001B[0m";

	

	public String getInput() {
		String result = "";
		Scanner sc = new Scanner(System.in);
		df.setRoundingMode(RoundingMode.DOWN);
		
		try {
			System.out.print("첫번째 숫자를 입력해 주세요 : ");
			double num_1 = sc.nextDouble();
			System.out.print("사칙연산 기호를 입력해 주세요 : ");
			String sign = sc.next().trim();
			System.out.print("두번째 숫자를 입력해 주세요 : ");
			double num_2 = sc.nextDouble();
			result = doCalculateBySgin(num_1, sign, num_2);
			
		} catch (InputMismatchException e) {
			result = ANSI_RED + "[ ERROR ]  {숫자만 입력해 주세요}" + TEXT_RESET;
			return result; 
		}
		return result;
	}
	
	
	



	private String doCalculateBySgin(double num_1, String sign, double num_2) {
		if(sign.equals("+")) {
			return num_1 + " " + sign + " " + num_2 + " = " + calculator.puls(num_1, num_2);
		}
		if(sign.equals("-")) {
			return num_1 + " " + sign + " " + num_2 + " = " + calculator.minus(num_1, num_2);
		}
		if(sign.equals("*")) {
			return num_1 + " " + sign + " " + num_2 + " = " + calculator.multiply(num_1, num_2);
		}
		if(sign.equals("/")) {
			return num_1 + " " + sign + " " + num_2 + " = " + calculator.divide(num_1, num_2);
		}
		return ANSI_RED + "[ ERROR ] {수식이 올바르지 않습니다}" + TEXT_RESET;
	}






	public void printResult(String result) {
		System.out.println(result);
		System.out.println("============================================================");
		System.out.println("============================================================");
		
	}

}
