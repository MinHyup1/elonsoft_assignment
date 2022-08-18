package com.utils;

import com.main.map.Stage;

public class StageUtil {

    public static void printStage (String location) {
        Stage stage = new Stage();
        switch (location.split(",")[0] ) {
            case "1"  : print(stage.getStage_1());
        }
    }

    private static void print(String[][] stageArray) {
        for (int i = 0; i < stageArray.length; i++) {
            for (int j = 0; j < stageArray[i].length; j++) {
                System.out.print(stageArray[i][j]);
            }
            System.out.println();
        }
    }

}
