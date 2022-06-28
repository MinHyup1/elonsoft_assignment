package main;

import java.util.Scanner;

public class GameStarter {
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("==============================================");
		System.out.println("==============================================");
		System.out.println("==============================================");
		System.out.println("==============================================");
		System.out.println("==============================================");
		System.out.println("==============================================");
		System.out.println("==============================================");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.print("\033[H\033[2J");
		System.out.flush();
		
		System.out.println("캐릭터 명을 입력하세요.");
		
		
	}
}
