package chapter04;

import java.util.Scanner;

public class Exercise07 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		boolean run = true;
		int balance = 0; // 잔고
		
		while(run) {
			System.out.println("-----------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-----------------------------------");
			System.out.print("선택> ");
			String choice = scanner.nextLine();
			int choice1 = Integer.parseInt(choice); // int choice = Integer.parseInt(scanner.nextLine())로 통합 가능
			
				if(choice1 == 1) {
					System.out.print("예금액> ");
					balance += Integer.parseInt(scanner.nextLine());
				} else if(choice1 == 2) {
					System.out.print("출금액> ");
					balance -= Integer.parseInt(scanner.nextLine());
				} else if(choice1 == 3) {
					System.out.print("잔고> ");
					System.out.println(balance);
				} else {
					run = false;
				}
					
		}
		System.out.println("프로그램 종료");
	}
}