package com.kmh.test;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import com.kmh.main.dto.Student;


class CalculatorTest {
	ArrayList<String> arrayList = new ArrayList<>();
	ArrayList<Student> students = new ArrayList<>(5);
	
	@Test
	void arrayTest() {
		String[] array = new String[5];
		System.out.println("array length : " + array.length);
		
		
		ArrayList<String> arrayList = new ArrayList<>(5);
		System.out.println("arrayList size : " + arrayList.size());
	}
	
	@Test
	void arrayTest2() {
		System.out.println("array");
		String[] array = new String[5];
		for (int i = 0; i < 5; i++) {
			array[i] = String.valueOf(i) + "번째 원소";
			System.out.println(array[i]);
		}

	}
	
	@Test
	void arryTest3() {
		System.out.println("ArrayList");
		ArrayList<String> arrayList = new ArrayList<>(5);
		for (int i = 0; i < 5; i++) {
			arrayList.add(String.valueOf(i) + "번째 원소");
			System.out.println(arrayList.get(i));
		}
	}
	
	

}
