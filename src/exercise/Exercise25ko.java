package exercise;

import java.util.Scanner;

public class Exercise25ko {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("500원짜리 동전의 갯수: ");
		String a = scanner.nextLine();
		
		System.out.print("100원짜리 동전의 갯수: ");
		String b = scanner.nextLine();
		
		System.out.print("50원짜리 동전의 갯수: ");
		String c = scanner.nextLine();
		
		System.out.print("10원짜리 동전의 갯수: ");
		String d = scanner.nextLine();
		
		int a1 = Integer.parseInt(a);
		int b1 = Integer.parseInt(b);
		int c1 = Integer.parseInt(c);
		int d1 = Integer.parseInt(d);
		int total = a1*500 + b1*100 + c1*50 + d1*10;
		
		System.out.println("저금통 안의 동전의 총 액수: " + total);
	}
}

