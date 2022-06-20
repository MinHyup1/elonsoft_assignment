package com.kmh.main.util;


import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;


public class InputOutput {
	Operation operation = new Operation();
	public static final DecimalFormat df = new DecimalFormat("#,###.###");
	public final String ANSI_RED = "\u001B[31m";
	public final String TEXT_RESET = "\u001B[0m";

	
	public String getInput() {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("첫번째 숫자를 입력해 주세요 : ");
			double num_1 = sc.nextDouble();
			System.out.print("사칙연산 기호를 입력해 주세요 : ");
			String symbol = sc.next().trim();
			System.out.print("두번째 숫자를 입력해 주세요 : ");
			double num_2 = sc.nextDouble();
			return doCalculateByOperator(num_1, symbol, num_2);
			
		} catch (InputMismatchException e) {
			e.printStackTrace();
		}
		return ANSI_RED + "[ ERROR ]  {숫자만 입력해 주세요}" + TEXT_RESET; 
	}

	private String doCalculateByOperator(double num_1, String symbol, double num_2) {
		if("+".equals(symbol)) {
			return num_1 + " " + symbol + " " + num_2 + " = " + operation.puls(num_1, num_2);
		}
		if("-".equals(symbol)) {
			return num_1 + " " + symbol + " " + num_2 + " = " + operation.minus(num_1, num_2);
		}
		if("*".equals(symbol)) {
			return num_1 + " " + symbol + " " + num_2 + " = " + operation.multiply(num_1, num_2);
		}
		if("/".equals(symbol)) {
			return num_1 + " " + symbol + " " + num_2 + " = " + operation.divide(num_1, num_2);
		}
		return ANSI_RED + "[ ERROR ] {수식이 올바르지 않습니다}" + TEXT_RESET;
	}

	public void printResult(String result) {
		System.out.println(result);
		System.out.println("============================================================");
		System.out.println("============================================================");
		
	}

}
