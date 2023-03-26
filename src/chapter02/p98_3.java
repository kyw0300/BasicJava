package chapter02;

import java.util.Scanner;

public class p98_3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("이름: ");
		String name = scanner.nextLine();
		
		System.out.print("주민번호 앞 6자리: ");
		String code = scanner.nextLine();
		
		System.out.print("전화번호: ");
		String phone = scanner.nextLine();
		
		System.out.println(name + "\n" + code + "\n" + phone);
	}
}