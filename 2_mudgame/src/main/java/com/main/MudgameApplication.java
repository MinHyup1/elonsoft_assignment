package com.main;

import com.main.charater.Character;
import com.main.gameController.Controller;
import com.main.map.Stage;
import com.utils.Console;
import com.utils.StageUtil;

import java.util.Map;
import java.util.Scanner;

public class MudgameApplication {
	public static <mainController> void main(String[] args) {
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
		Stage stage_1 = new Stage();
		Controller controller = new Controller();


		controller.mainController(character ,stage_1);










		
	}
	


}
