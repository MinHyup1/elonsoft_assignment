package com.main;

import java.util.Scanner;

public class MudgameApplication {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("머드게임 을 시작합니다...");
			System.out.println("캐릭터의 별칭을 입력해주세요.");
			String name = sc.next();
			System.out.println("당신의 캐릭터의 별칭은 \"" + name + "\"입니다." );
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println();
		
		
	}

}
