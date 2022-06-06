package com.kmh.test;

import org.junit.jupiter.api.Test;

import com.kmh.main.util.Calculator;

class CalculatorTest {
	
	Calculator calculator = new Calculator();
	
	
	
	
	@Test
	void plusTest() {
		System.out.println(calculator.puls(10000000.39936663, 3));
	}
	
	@Test
	void minusTest() {
		System.out.println(calculator.minus(2.5, 3));
	}
	
	@Test
	void multiplyTest() {
		System.out.println(calculator.multiply(1000, 3));
	}
	
	@Test
	void divideTest() {
		System.out.println(calculator.divide(2.5, 3));
	}

}
