package com.main.gameController;

import com.main.charater.Character;
import com.main.map.Stage;
import com.utils.Console;
import com.utils.StageUtil;

import java.util.Map;
import java.util.Scanner;

public class Controller {

    public void mainController (Character character) {
        Stage stage = new Stage();
        boolean on = true;
        boolean isInfo = false;
        while (on) {
            Console.clearConsole();
            if(isInfo) character.printCharacterInfo(); isInfo=false;
            Scanner input = new Scanner(System.in);
            StageUtil.printStage(character.getLocation(), stage);
            System.out.println("a : 왼쪽으로 이동   w : 위로 이동  d : 오른쪽으로 이동  s : 아래로 이동");
            System.out.println("1. 캐릭터 정보 2.게임 종료");
            switch (input.nextLine()) {
                case "1" : isInfo = true; break;
                case "2" : on = false; continue;
                case "a" : moveLeft(character.getLocation());
                case "w" : moveUp(character.getLocation());
                case "d" : moveRight(character.getLocation());
                case "s" : moveDown(character.getLocation());
                default: continue;
            }

        }
    }

    private Map<String,int[]> moveUp(int[] CharacterLocation) {
        if (CharacterLocation[0] == 1)
        for (int i = 0; i < CharacterLocation.length; i++) {
            System.out.println();
        }
        return null;
    }

    private void moveDown(int[] CharacterLocation) {
    }

    private void moveLeft(int[] CharacterLocation) {
    }

    private void moveRight(int[] CharacterLocation) {
    }
}
