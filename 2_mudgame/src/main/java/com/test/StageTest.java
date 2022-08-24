package com.test;

import com.main.map.Stage;

public class StageTest {


    //달팽이 : 🐌
    //🧍‍

    public static void main(String[] args) {

        Stage newStage = new Stage();

        System.out.println(newStage.getStage_1().length);
        System.out.println(newStage.getStage_1()[0].length);

        System.out.println(newStage.getStage_1()[0][0]);
        System.out.println(newStage.getStage_1().length);
        System.out.println(newStage.getStage_1()[0].length);

        for (int i = 0; i < newStage.getStage_1().length; i++) {
            for (int j = 0; j < newStage.getStage_1()[i].length; j++) {
                System.out.print(newStage.getStage_1()[i][j]);
            }
            System.out.println();
        }

    }


}

