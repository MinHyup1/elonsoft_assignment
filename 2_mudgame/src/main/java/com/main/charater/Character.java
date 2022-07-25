package com.main.charater;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Character {

    private String name;
    private int level = 1;
    private int curExp = 0;
    private int maxExp = 5;
    private int damage = 10;
    private CharacterJob characterJob;


    public static final Scanner sc = new Scanner(System.in);

    public String setCharacterName () {
        String name = sc.nextLine().trim();
        this.name = name;
        return name;
    };

    public void increaseCurExp(int exp) {
        this.curExp += exp;
        if(this.curExp >= this.maxExp) levelUP(); increaseMaxExp(); increaseDamage();

    }

    public void levelUP() {
        this.level += 1;
    }

    public void increaseMaxExp() {
        this.maxExp += (this.level + 1) * 5;
    }

    public void increaseDamage() {
        this.damage += (this.level + 1) * 5;
    }

    public void setCharacterJob () {
        boolean flg = true;

        while (flg) {
            try {
                int jobNum = sc.nextInt();

                if (jobNum == 0 || jobNum > 4) {
                    System.out.println("올바른 숫자를 입력해주세요");
                    continue;
                }
                if(jobNum == '1') { }
                if(jobNum == '2') { }
                if(jobNum == '3') { }
                if(jobNum == '4') { }

            }catch (InputMismatchException e) {//무한로프에 빠지는거 해결
                System.out.println("숫자만 입력해주세요.");
                sc.nextLine();
                setCharacterJob();
            }

        }
    };

    public void printChracterInfo() {

    }



}
