package exercise;

import java.util.Scanner;

public class Exercise24ko {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("원기둥 밑변의 반지름을 입력하시오.(단위: cm): ");
		String r = scanner.nextLine();
		
		System.out.print("원기둥의 높이를 입력하시오.(단위: cm): ");
		String h = scanner.nextLine();
		
		double r1 = Double.parseDouble(r);
		double h1 = Double.parseDouble(h);
		double area = r1 * r1 * Math.PI;
		double v = area * h1;
		
		System.out.println("원기둥 밑변의 넓이는 " + area + "㎠이고,"
				+ " 원기둥의 부피는 " + v + "㎤이다.");
	}
}
