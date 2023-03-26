package cbtproject;

import java.util.Scanner;

public class CbtFrontController {
	private CbtController cbtcontroller = new CbtController();
	Scanner scanner = new Scanner(System.in);
	
	public void process() throws Exception {
		System.out.println("cbt프로그램");
		while(true) {
			System.out.println("1.로그인 | 2.회원가입 | 3.문제풀기 | 0.종료");
			System.out.println("---------------------------------------------------");
			System.out.print("메뉴 선택> ");
			int selectMenu = Integer.parseInt(scanner.nextLine());
			System.out.println();
			switch (selectMenu) {
			case 1:
				break;
			case 2:
				break;
			case 3:
				cbtcontroller.question(scanner);
				break;
			case 4:
				break;
			case 5:
				break;
			case 0:
				System.out.println("프로그램을 종료합니다.");
				System.exit(selectMenu);
				break;
			}
		}
	}
}
