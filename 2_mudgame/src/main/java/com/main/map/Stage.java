package com.main.map;

import java.util.HashMap;
import java.util.Map;

public class Stage {
    //모든스테이지는 5 X 20으로 구성되어있음
    //Map 첫번째 요소는 x,y 좌표로 구성되어있음
    public Map<Integer,String> stage_1 () {

        Map<String,String> stage1 = new HashMap<>();
        for (int i = 0; i < 20; i++) {
            stage1.put(String.valueOf(i) + "0","■");
            stage1.put(String.valueOf(i) + "5","■");
        }

        for (int i = 0;  i< 20 ; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.println(stage1.get(String.valueOf(i) +"," + String.valueOf(j)));
            }
        }
        return null;
    }


}
