package com.main.monster.stage_1;

import com.main.monster.Monster;
import lombok.Getter;
@Getter
public class Snail extends Monster {


    public Snail() {
        this.name = "달팽이";
        this.img = "\uD83D\uDC0C";
        this.hp = 10;
        this.exp = 5;
    }


}
