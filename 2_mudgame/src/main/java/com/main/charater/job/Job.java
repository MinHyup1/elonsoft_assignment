package com.main.charater.job;

import lombok.Data;
import lombok.Getter;

import java.util.Map;
@Getter
public abstract class Job {
    String jobname;

    public Map<String, Double> attack (int damage) {
        return Map.of("기본공격" ,damage * (1 + Math.random()));
    }

    abstract Map<String, Double> SetJobSkill_2(int damage);

    abstract Map<String, Double> SetJobSkill_3(int damage);



}
