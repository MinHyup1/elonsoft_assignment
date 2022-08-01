package com.main.charater;

import lombok.Data;
import lombok.Getter;
@Data
public abstract class CharacterJob  {

    private String jonName;
    private String jobSkillName_1;
    private String jobSkillName_2;
    private String jobSkillName_Ultimate;

    private int attack (int damage) {
        return (int) (damage * (Math.random() + 1 ));
    }

    public abstract void jobSkill_1(int damage);

    public abstract void jobSkill_2(int damage);

    public abstract void jobSkill_Ultimate(int damage);



}
