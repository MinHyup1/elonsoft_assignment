package com.kmh.test;

import org.junit.jupiter.api.Test;

import com.kmh.main.util.Operation;
import com.kmh.main.util.InputOutput;

class CalculatorTest {
	InputOutput io = new InputOutput();
	Operation operator = new Operation();
	
	
	@Test
	void getInputTest() {
		System.out.println(io.getInput());
		
	}
	
	@Test
	void plusTest() {
		System.out.println(operator.puls(0.11111, 0.55555));
	}
	
	@Test
	void minusTest() {
		System.out.println(operator.minus(0.9999, 0.2222));
	}
	
	@Test
	void multiplyTest() {
		System.out.println(operator.multiply(1000, -3));
	}
	
	@Test
	void divideTest() {
		System.out.println(operator.divide(2.5, 3));
	}

}
