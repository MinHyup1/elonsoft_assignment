package com.test;

import com.main.map.Stage;

public class StageTest {


    //달팽이 : 🐌
    //🧍‍

    public static void main(String[] args) {

        Stage newStage = new Stage();

        System.out.println(newStage.getStage().length);
        System.out.println(newStage.getStage()[0].length);

        System.out.println(newStage.getStage()[3][0]);

        for (int i = 0; i < newStage.getStage().length; i++) {
            for (int j = 0; j < newStage.getStage()[i].length; j++) {
                System.out.print(newStage.getStage()[i][j]);
            }
            System.out.println();
        }

    }
}

