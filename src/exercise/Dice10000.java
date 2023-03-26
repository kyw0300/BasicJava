package exercise;

import java.util.Random;

public class Dice10000 {
	public static void main(String[] args) {
		Random random = new Random();
		int[] arr = new int[6];
		
		for (int i = 0; i < 10000; i++) {
			int dice = random.nextInt(6);
			arr[dice]++;	
		}
		
		for(int i=0; i<arr.length; i++) {
		System.out.println(i+1 + "        " + arr[i]);
		}
	}
}
