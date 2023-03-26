package exercise;

import java.util.Scanner;

public class Exercise31 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫 번째 숫자를 입력하세요: ");
		int a = scanner.nextInt();
		
		System.out.print("두 번째 숫자를 입력하세요: ");
		int b = scanner.nextInt();
		
		int big = ((a+b) + Math.abs(a-b)) / 2;
		int small = ((a+b) - Math.abs(a-b)) / 2;
		
		System.out.println("큰 수를 작은 수로 나눈 몫은 "
		+ big/small + "이고, 나머지는 " + (big%small) + "이다.");
	}
}
