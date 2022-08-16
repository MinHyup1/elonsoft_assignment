package com.utils;

import com.main.map.Stage;

public class StageUtil {

    public static void printStage (Stage stage) {
        for (int i = 0; i < stage.getStage_1().length; i++) {
            for (int j = 0; j < stage.getStage_1()[i].length; j++) {
                System.out.print(stage.getStage_1()[i][j]);
            }
            System.out.println();
        }
    }

}
