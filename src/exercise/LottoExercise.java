package exercise;

import java.util.Random;

public class LottoExercise {
	public static void main(String[] args) {
		Random random = new Random();
		
		int[] arr = new int[45];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
		}
		
		
		for (int i = 0; i < arr.length; i++) {
			int ranNum = random.nextInt(45);
			int temp = arr[i];
			arr[i] = arr[ranNum];
			arr[ranNum] = temp;
		}
		
		for (int i = 0; i < 6; i++) {
			if(i!=0) {
			System.out.print(", ");
			}
			System.out.print(arr[i]);
		}
	}
}
