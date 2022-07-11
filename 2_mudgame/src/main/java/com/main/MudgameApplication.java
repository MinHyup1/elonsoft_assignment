package com.main;

import java.util.InputMismatchException;

import com.utils.CharacterSetter;

public class MudgameApplication {
	

	public static void main(String[] args) {
		CharacterSetter characterSetter = new CharacterSetter(); 
		int jobNum = 0;
		try {
			System.out.println("머드게임 을 시작합니다...");
			System.out.println("캐릭터의 별칭을 입력해주세요.");
			
			String name = characterSetter.setCharacterName();
			System.out.println("당신의 캐릭터의 별칭은 \"" + name + "\"입니다." );
			Thread.sleep(1000);
			
			System.out.println("당신의 캐릭터의 직업을 고르세요.");
			System.out.println("1. 전사");
			System.out.println("2. 궁수");
			System.out.println("3. 도적");
			System.out.println("4. 마법사");
			jobNum = characterSetter.setCharacterJobNum();
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (InputMismatchException e) {
			System.out.println("숫자만 입력해주세요.");
		}
		
		System.out.println(jobNum);
		
		
	}
	


}
