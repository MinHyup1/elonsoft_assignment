package com.utils;

import java.util.Scanner;

public class CharacterSetter {
	public static final Scanner sc = new Scanner(System.in);
	
	public String setCharacterName () {
		String name = sc.next();
		return name;
	};
	
	public int setCharacterJobNum () {
		int jobInput = sc.nextInt();
		if(jobInput != 1 || jobInput != 2 || jobInput != 3 || jobInput != 4)  {
			System.out.println("올바른 숫자를 입력해주세요");
		}
		return jobInput;
	};

}
