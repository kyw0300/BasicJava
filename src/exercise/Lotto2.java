package exercise;

import java.util.Random;

public class Lotto2 {
	public static void main(String[] args) {
		Random random = new Random();
		int[] lotto = new int[45];
		for(int i=0; i<lotto.length; i++) {
			lotto[i]= i+1;
		}
		int temp=0;
		for(int i=0; i<lotto.length; i++) {
			int ranNum = random.nextInt(45);
			
			temp = lotto[i];
			lotto[i] = lotto[ranNum];
			lotto[ranNum] = temp;
			
		}
		for(int i=0; i<6; i++) {
			System.out.println(lotto[i]);
		}
	}
}
