package com.main.charater;

import com.main.charater.job.Archer;
import com.main.charater.job.Job;
import com.main.charater.job.Warrior;
import lombok.Getter;

import java.util.InputMismatchException;
import java.util.Scanner;

@Getter
public class Character {

    private String name;
    private int level = 1;
    private int curExp = 0;
    private int maxExp = 5;
    private int damage = 10;

    private com.main.charater.job.Job Job;


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

                switch (jobNum) {
                    case 1 : this.Job = new Warrior(); break;
                    case 2 : this.Job = new Archer(); break;
                    case 3 : this.Job = new Warrior(); break;
                    case 4 : this.Job = new Warrior(); break;
                    default: System.out.println("올바른 숫자를 입력해주세요");
                    continue;
                }
                break;
            }catch (InputMismatchException e) {//무한로프에 빠지는거 해결
                System.out.println("숫자만 입력해주세요.");
                sc.nextLine();
                setCharacterJob();
            }

        }
    };

    public void printCharacterInfo() {
        System.out.println("이름     :  " + this.name );
        System.out.println("직업     :  " + getJob().getJobname() );
        System.out.println("level    :  " + this.level );
        System.out.println("경험치   :  " + this.curExp + "/" + this.maxExp  );
    }



}
