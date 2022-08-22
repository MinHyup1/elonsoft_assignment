package com.utils;

import com.main.charater.Character;
import com.main.map.Stage;

public class StageUtil {

    public static void printStage (int[] CharacterLocation, Stage stage) {

        switch (CharacterLocation[0] ) {
            case 1  : print(stage.getStage_1() , CharacterLocation);
        }
    }

    private static void print(String[][] stageArray, int[] CharacterLocation) {
        for (int i = 0; i < stageArray.length; i++) {
            for (int j = 0; j < stageArray[i].length; j++) {
                System.out.print(stageArray[i][j]);
            }
            System.out.println();
        }
    }

}
