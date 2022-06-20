package com.kmh.main;

import java.math.RoundingMode;

import com.kmh.main.util.InputOutput;

public class Calculatorapplication {
	
	public static void main(String[] args) {	
		InputOutput io = new InputOutput();
		boolean isContinue = true;
		
		System.out.println("계산기 프로그램을 시작하겠습니다.");
		System.out.println("사용방식은 숫자1 입력 -> 사칙연산기호 입력 -> 숫자2 입력하시면 계산결과가 출력됩니다.");
		io.df.setRoundingMode(RoundingMode.DOWN);
		
		while (isContinue) {
			io.printResult(io.getInput());
		}
		
	}

}
