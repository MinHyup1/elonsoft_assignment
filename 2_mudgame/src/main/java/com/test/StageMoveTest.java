package com.test;

import com.main.charater.Character;
import com.main.map.Stage;

public class StageMoveTest {


    //달팽이 : 🐌
    //🧍‍

    public static void main(String[] args) {

        Character character =  new Character();


            for (int i = 0; i < character.getLocation().split(",").length; i++) {
                System.out.println(character.getLocation().split(",")[i]);
            }


    }


}

