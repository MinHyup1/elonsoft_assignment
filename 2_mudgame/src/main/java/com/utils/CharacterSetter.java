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
		return jobInput;
	};

}
