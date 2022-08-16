package com.main.gameController;

import com.main.charater.Character;
import com.main.map.Stage;
import com.utils.Console;
import com.utils.StageUtil;

import java.util.Scanner;

public class Controller {

    public void mainController (Character character, Stage stage_1) {
        boolean on = true;
        while (on) {
            Console.clearConsole();
            switch (new Scanner(System.in).nextLine()) {
                case "1" : character.printCharacterInfo();break;
                case "2" : on = false; continue;
                case "a" :
                case "w" :
                case "d" :
                case "s" :
                default: continue;
            }

            StageUtil.printStage(stage_1);
            System.out.println("a : 왼쪽으로 이동   w : 위로 이동  d : 오른쪽으로 이동  s : 아래로 이동");
            System.out.println("1. 캐릭터 정보 2.게임 종료");
        }






    }
}
