package com.main.gameController;

import com.main.charater.Character;
import com.main.map.Stage;
import com.main.monster.Monster;
import com.utils.Console;
import com.utils.StageUtil;

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

            printController(character.getNowLocation(), stage);
            Scanner input = new Scanner(System.in);
            switch (input.nextLine()) {
                case "1" : isInfo = true; break;
                case "2" : on = false; continue;
                case "a" :  move(character, stage ,"left");  break;
                case "w" :  move(character, stage ,"up");    break;
                case "d" :  move(character, stage ,"right"); break;
                case "s" :  move(character, stage ,"down");  break;
                default: continue;
            }

        }
    }

    private void move(Character character ,Stage stage, String direction) {
        int stageNum = character.getBeforeLocation()[0];
        Object[][] afterStage = stage.getStage(stageNum);

        //이동중 벅을 만날시 리턴
        if((character.getNowLocation()[1] == 1 && "up".equals(direction) )
                || (character.getNowLocation()[2] == 0 && "left".equals(direction))
                || (character.getNowLocation()[2] == 40 && "right".equals(direction))
                || (character.getNowLocation()[1] == 7 && "down".equals(direction)) ) return;

        //이동전 캐릭터가 있던자리는 " "
        afterStage[character.getBeforeLocation()[1]][character.getBeforeLocation()[2]] = "  ";

        //키를 누른 위치로 현재 캐릭터의 위치좌표를 변경
        switch (direction) {
            case "up"   : character.setNowLocation(new int[]{character.getBeforeLocation()[0], character.getBeforeLocation()[1] - 1, character.getBeforeLocation()[2]}); break;
            case "right": character.setNowLocation(new int[]{character.getBeforeLocation()[0], character.getBeforeLocation()[1], character.getBeforeLocation()[2] + 1}); break;
            case "down" : character.setNowLocation(new int[]{character.getBeforeLocation()[0], character.getBeforeLocation()[1] + 1, character.getBeforeLocation()[2]}); break;
            case "left" : character.setNowLocation(new int[]{character.getBeforeLocation()[0], character.getBeforeLocation()[1], character.getBeforeLocation()[2] - 1}); break;
        }
        
        //이동한 위치에 몬스터가 위치 할 경우
        if(afterStage[character.getNowLocation()[1]][character.getNowLocation()[2]] instanceof Monster) {
            battleToMonster((Monster) afterStage[character.getNowLocation()[1]][character.getNowLocation()[2]]);

        }

        //현재 캐릭터의 위치를 표시
        afterStage[character.getNowLocation()[1]][character.getNowLocation()[2]] = "🧍";

        //캐릭터의 이전위치를 현재이동한 위치로 저장
        character.setBeforeLocation(character.getNowLocation());

        stage.setStage(afterStage,stageNum);


    }

    private void battleToMonster(Monster monster) {
        boolean isMonsterAlive = true;
        while (isMonsterAlive) {
            System.out.println("야생의 " + monster.getName() + "이(가) 나타났다!!!");

        }
    }

    private  void printController (int[] afterLocation, Stage stage) {
        StageUtil.printStage(afterLocation, stage);
        System.out.println("a : 왼쪽으로 이동   w : 위로 이동  d : 오른쪽으로 이동  s : 아래로 이동");
        System.out.println("1. 캐릭터 정보 2.게임 종료");
    }
}
