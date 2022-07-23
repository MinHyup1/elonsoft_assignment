package com.utils;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CharacterSetter {
	public static final Scanner sc = new Scanner(System.in);
	
	public String setCharacterName () {
		String name = sc.nextLine().trim();
		return name;
	};
	
	public int setCharacterJobNum () {
		boolean flg = true;
		while (flg) {
			try {
				int jobInput = sc.nextInt();
				if (jobInput == 0 || jobInput > 4) {
					System.out.println("올바른 숫자를 입력해주세요");
					continue;
				}
				return jobInput;
			}catch (InputMismatchException e) {//무한로프에 빠지는거 해결
				System.out.println("숫자만 입력해주세요.");
				continue;
			}


		}
		return 1;
	};

}
