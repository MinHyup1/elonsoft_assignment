package com.main.charater;

import lombok.Data;
import lombok.Getter;
public interface CharacterJob  {



    private int attack (int damage) {
        return (int) (damage * (Math.random() + 1 ));
    }

    public void jobSkill_1(int damage);

    public void jobSkill_2(int damage);

    public void jobSkill_Ultimate(int damage);



}
