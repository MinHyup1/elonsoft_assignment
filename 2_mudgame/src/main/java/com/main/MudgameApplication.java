package com.main;

import com.main.charater.Character;
import com.utils.Console;

public class MudgameApplication {
	public static void main(String[] args) {
		final Console console = new Console();

		int jobNum = 0;
			System.out.println("머드게임 을 시작합니다...");
			System.out.println("캐릭터의 별칭을 입력해주세요.");
			Character character = new Character();
			String name = character.setCharacterName();
			System.out.println("당신의 캐릭터의 별칭은 \"" + name + "\"입니다." );
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
		console.clearConsole();

		System.out.println("당신의 캐릭터의 직업을 고르세요.");
		System.out.println("1. 전사");
		System.out.println("2. 궁수");
		System.out.println("3. 도적");
		System.out.println("4. 마법사");
		character.setCharacterJob();

		console.clearConsole();
		character.printCharacterInfo();







		
	}
	


}
