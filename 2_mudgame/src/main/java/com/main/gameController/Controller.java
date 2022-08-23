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

            if(isInfo) {
                character.printCharacterInfo();
                isInfo=false;
            }

            printController(character.getAfterLocation(), stage);
            Scanner input = new Scanner(System.in);
            switch (input.nextLine()) {
                case "1" : isInfo = true; break;
                case "2" : on = false; continue;
                case "a" : moveLeft(character, stage);
                case "w" : moveUp(character, stage);
                case "d" : moveRight(character);
                case "s" : moveDown(character);
                default: continue;
            }

        }
    }

    private Map<String,int[]> moveUp(Character character ,Stage stage) {
        int stageNum = character.getBeforeLocation()[0];
        String[][] afterStage = stage.getStage(stageNum);
        afterStage[character.getBeforeLocation()[1]][character.getBeforeLocation()[2]] = "";
        afterStage[character.getAfterLocation()[1]][character.getAfterLocation()[2]] = "🧍";
        character.setBeforeLocation(character.getBeforeLocation());
        //20220823 여기부터

        stage.setStage(afterStage,stageNum);

        return null;
    }

    private void moveDown(Character character) {
    }

    private void moveLeft(Character character, Stage stage) {
    }

    private void moveRight(Character character) {
    }

    private  void printController (int[] afterLocation, Stage stage) {
        StageUtil.printStage(afterLocation, stage);
        System.out.println("a : 왼쪽으로 이동   w : 위로 이동  d : 오른쪽으로 이동  s : 아래로 이동");
        System.out.println("1. 캐릭터 정보 2.게임 종료");
    }
}
