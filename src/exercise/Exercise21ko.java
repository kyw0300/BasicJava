package exercise;

import java.util.Scanner;

public class Exercise21ko {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("가로의 길이는?(단위: m): ");
		String width = scanner.nextLine();
		
		System.out.print("세로의 길이는?(단위: m): ");
		String height = scanner.nextLine();
		
		double width1 = Double.parseDouble(width);
		double height1 = Double.parseDouble(height);
		
		double area = width1 * height1;
		double perimeter = 2 * (width1 + height1);
		
		System.out.println("직사각형의 넓이: " + area);
		System.out.println("직사각형의 둘레: " + perimeter);
		
	}
}
