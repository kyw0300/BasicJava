package chapter04;

import java.util.Scanner;

public class SwitchStringExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("당신의 직급을 입력하시오: ");
		String position = scanner.nextLine();
		
		switch (position) {
		case "주임":
			System.out.println(position + "의 월급은 150만원입니다.");
			break;
		case "대리":
			System.out.println(position + "의 월급은 300만원입니다.");
			break;
		case "과장":
			System.out.println(position + "의 월급은 500만원입니다.");
			break;
		case "부장":
			System.out.println(position + "의 월급은 700만원입니다.");
			break;
		default:
			System.out.println(position + "의 월급은 10만원입니다.");
		}
	}
}
