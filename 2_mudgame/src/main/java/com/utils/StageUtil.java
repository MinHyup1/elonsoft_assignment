package com.utils;

import com.main.charater.Character;
import com.main.map.Stage;
import com.main.monster.Monster;

import java.util.Map;

public class StageUtil {

    public static void printStage (int[] CharacterLocation, Stage stage) {

        switch (CharacterLocation[0] ) {
            case 1  : print(stage.getStage_1() , CharacterLocation);
        }
    }

    private static void print(Object[][] stageArray, int[] CharacterLocation) {
        for (int i = 0; i < stageArray.length; i++) {
            for (int j = 0; j < stageArray[i].length; j++) {
                if(stageArray[i][j] instanceof Monster) {
                    System.out.printf("%3s",((Monster) stageArray[i][j]).getImg());
                    continue;
                }
                System.out.printf("%3s",stageArray[i][j]);
            }
            System.out.println();
        }
    }

}
