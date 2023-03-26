package chapter04;

import java.util.Scanner;

public class Continue {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("1부터 입력한 수 까지 3의 배수 출력: ");
		int i = scanner.nextInt();
		
		for(int n = 1; n <= i ; n++) {
			
			if(n%3 != 0) {
				continue;
			}
			
			System.out.println(n);
			
		}
		System.out.println("입력한 수 까지 출력 끝");
	}
}
