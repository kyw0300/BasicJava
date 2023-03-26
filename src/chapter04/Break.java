package chapter04;

import java.util.Random;

public class Break {
	public static void main(String[] args) {
		Random random = new Random();
		System.out.println("6이 나올때까지 돌림");
		
		while(true) {
			int ranNum = random.nextInt(6) + 1;
			System.out.println(ranNum);
			
			if(ranNum == 6) {
				break;
			}
			
		}
		System.out.println("6이 나왔으므로 종료");
	}
}
