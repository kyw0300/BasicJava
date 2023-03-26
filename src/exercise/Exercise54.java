package exercise;

import java.util.Random;

public class Exercise54 {
	public static void main(String[] args) {
		Random random = new Random();
		
		int[] result = new int[6];
		int count = 0;
		boolean run = true;
		
		while(run) {
			int  dice = random.nextInt(6) + 1;
			
			switch(dice) {
			case 1:
				result[0]++;
				break;
			case 2:
				result[1]++;
				break;
			case 3:
				result[2]++;
				break;
			case 4:
				result[3]++;
				break;
			case 5:
				result[4]++;
				break;
			case 6:
				result[5]++;
				break;	
			}
			count++;
			if(count == 10000) {
				run = false;
			}
		}
		System.out.println("----------------------");
		System.out.println("  면          빈도");
		System.out.println("----------------------");
		for(int i=0; i<result.length; i++) {
			System.out.println("  " + (i+1) + "           " + result[i]);
		}
	}
}
