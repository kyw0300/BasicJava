package chapter04;

import java.util.Random;

public class IfDiceExample {
	public static void main(String[] args) {
//		double a = Math.random();
//		System.out.println(a);
		
		Random random = new Random(); // Random(long seed): 시드값에 따라 값 결정 , 
		                              // SecureRandom도 있다
		
		int ranNum1 = random.nextInt(6) + 1;
		int ranNum2 = random.nextInt(6) + 1;
		int ranNum3 = random.nextInt(6) + 1;
		int ranNum4 = random.nextInt(6) + 1;
		int ranNum5 = random.nextInt(6) + 1;
		int ranNum6 = random.nextInt(6) + 1;
		
		int ranNum10 = (int)(Math.random() * 6) + 1;
		
		
		System.out.println(ranNum1); // Alt + Shift + A : 새로로 커서변경
		System.out.println(ranNum2); // Ctrl + Alt + 아래 : 한 줄 복사
		System.out.println(ranNum3);
		System.out.println(ranNum4);
		System.out.println(ranNum5);
		System.out.println(ranNum6);		
	}
}
