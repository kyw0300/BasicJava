package chapter04;

import java.util.Random;

public class Exercise03 {
	public static void main(String[] args) {
		Random random = new Random();
		int ranNum1;
		int ranNum2;
		
		while (true) {
			ranNum1 = random.nextInt(6) + 1;
			ranNum2 = random.nextInt(6) + 1;
			System.out.println("(" + ranNum1 + "," + ranNum2 + ")");
			
			if(ranNum1 + ranNum2 == 5) {
				break;
			}
		}
		System.out.println("합이 5가 되어 실행을 종료");
	}
}
