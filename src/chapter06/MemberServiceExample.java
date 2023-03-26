package chapter06;

import java.util.Scanner;

public class MemberServiceExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		MemberService memberService = new MemberService();
		
		System.out.print("id를 입력하시오: ");
		String id = scanner.nextLine();
		System.out.print("password를 입력하시오: ");
		String password = scanner.nextLine();
		
		
		boolean result = memberService.login(id, password);
		
		if(result) {
			System.out.println("로그인 되었습니다");
			//memberService.logout("hong");
		} else {
			System.out.println("id 또는 password가 올바르지 않습니다.");
		}
	}
}
