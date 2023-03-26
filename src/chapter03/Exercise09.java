package chapter03;

import java.util.Scanner;

public class Exercise09 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫 번째 수: ");
		String num1 = scanner.next();
		
		System.out.print("두 번째 수: ");
		String num2 = scanner.next();
		System.out.println("------------------");
		
		double num11 = Double.parseDouble(num1);
		double num22 = Double.parseDouble(num2);
				
		
		if((num22 == 0) || (num22 == 0.0)) {
			System.out.println("결과: 무한대");
		} else {
			System.out.println("결과: " + num11/num22);
		}
				
	}
}
