package exercise;

import java.util.Random;
import java.util.Scanner;

public class Exercise45 {
	public static void main(String[] args) {
		Random random = new Random();
		int ranNum = random.nextInt(100) + 1;
		//System.out.println(ranNum);
		
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		while(true) {
			System.out.print("1부터 100 사이의 정수 중 하나를 선택하세요: ");
			int num = scanner.nextInt();
			sum += 1;
			
			if(num < ranNum) {
				System.out.println("정답은 더 큰 수입니다.\n");
			} else if(num > ranNum) {
				System.out.println("정답은 더 작은 수입니다.\n");
			} else {
				break;
			}
			
		}
		System.out.println("정답입니다.");
		System.out.println(sum + "번 만에 맞추셨습니다!!");
		System.out.println("게임을 종료합니다.");	
	}
}
