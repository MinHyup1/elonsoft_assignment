package com.kmh.main;

import com.kmh.main.util.InputOutput;

public class Calculatorapplication {
	
	public static void main(String[] args) {	
		InputOutput io = new InputOutput();
		boolean isContinue = true;
		
		System.out.println("계산기 프로그램을 시작하겠습니다.");
		System.out.println("사용방식은 숫자1 입력 -> 사칙연산기호 입력 -> 숫자2 입력하시면 계산결과가 출력됩니다.");
		
		while (isContinue) {
			io.printResult(io.getInput());
			System.out.println("============================================================");
			System.out.println("============================================================");
		}
		
	}

}
