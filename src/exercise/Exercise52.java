package exercise;

import java.util.Random;

public class Exercise52 {
	public static void main(String[] args) {
		Random random = new Random();

		System.out.println("*** 로또 추첨 ***");
		int[] lotto = new int[6];
	
		for(int i=0; i<6; i++) {
			lotto[i] = random.nextInt(45) + 1;
			
			for(int j=0; j<i; j++) {
				if(lotto[j] == lotto[i]) {
					i--;
					break;
				}
			}
		}
		for(int i=0; i<lotto.length; i++) {
			System.out.println((i+1) + "번째 번호: " + lotto[i]);
		}
	}
}
