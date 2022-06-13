package com.kmh.test;

import org.junit.jupiter.api.Test;

import com.kmh.main.util.Calculator;
import com.kmh.main.util.InputOutput;

class CalculatorTest {
	InputOutput io = new InputOutput();
	Calculator calculator = new Calculator();
	
	
	@Test
	void getInputTest() {
		System.out.println(io.getInput());
		
	}
	
	@Test
	void plusTest() {
		System.out.println(calculator.puls(0.11111, 0.55555));
	}
	
	@Test
	void minusTest() {
		System.out.println(calculator.minus(0.9999, 0.2222));
	}
	
	@Test
	void multiplyTest() {
		System.out.println(calculator.multiply(1000, -3));
	}
	
	@Test
	void divideTest() {
		System.out.println(calculator.divide(2.5, 3));
	}

}
