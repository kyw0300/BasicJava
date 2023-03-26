package exercise;

import java.util.Scanner;

public class Exercise43 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("점수를 입력하세요.");

		System.out.print("프로그래밍 기초: ");
		int program = scanner.nextInt();

		System.out.print("데이터베이스: ");
		int data = scanner.nextInt();

		System.out.print("화면 구현: ");
		int screen = scanner.nextInt();

		System.out.print("애플리케이션 구현: ");
		int app = scanner.nextInt();

		System.out.print("머신러닝: ");
		int machine = scanner.nextInt();

		int total = program + data + screen + app + machine;
		double avr = (double) (program + data + screen + app + machine) / 5;
		System.out.println("총점: " + total);
		System.out.printf("평균: %.2f\n" , avr);

		if (avr >= 90) {
			System.out.println("학점: A");
		} else if (avr >= 80) {
			System.out.println("학점: B");
		} else if (avr >= 70) {
			System.out.println("학점: C");
		} else if (avr >= 60) {
			System.out.println("학점: D");
		} else {
			System.out.println("학점: F");
		}
	}
}
