package com.main.charater.job;

import lombok.Getter;

import java.util.Map;

@Getter
public class Archer extends Job {

    //static final을 하는이유 - 값을 불변으로 만들기위해 , static 생성자를 통해 값을 참조 방지
    public Archer() {
        this.jobname = "궁수";
    }


    @Override
    Map<String, Double> SetJobSkill_2(int damage) {//사용가능레벨 : 5
        return Map.of("더블 샷" ,(damage * 1.5) * (1 + Math.random()));
    }

    @Override
    Map<String, Double> SetJobSkill_3(int damage) {//사용가능레벨 : 20
        return Map.of("파워스트라이크" ,(damage * 2.5) * (1 + Math.random()));
    }
}
