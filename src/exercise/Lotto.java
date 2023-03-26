package exercise;

import java.util.Random;

public class Lotto {
	public static void main(String[] args) {
		Random random = new Random();
		
		int[] lotto = new int[45];
		
		for (int i = 0 ; i < lotto.length ; i++) {
			lotto[i] = i+1;
		}
		
		
		int temp;
		for (int i = 0; i < lotto.length; i++) {
			int ranNum = random.nextInt(45);
			temp = lotto[i];  //자리바꿈
			lotto[i] = lotto[ranNum];
			lotto[ranNum] = temp;
			
//			temp = lotto[i];
//			lotto[i] = lotto[random.nextInt(45)];  랜덤값1
//			lotto[random.nextInt(45)] = temp;      랜덤값2 또 나옴 ranNum 지정해줘야함
		
		
				
//			temp = random.nextInt(45) + 1;
//			System.out.println(temp);
//			temp = lotto[i];
//			lotto[i] = lotto[temp-1];
//			lotto[temp-1] = temp;
		}
		
		for(int j=0; j<6; j++) {
			if(j != 0) {
				System.out.print(", ");	//쉼표찍기, 앞 뒤 쉼표찍기 다 가능	
			}
			System.out.print(lotto[j]);
		}
	}
}
//i=0
// int temp = arr[i];
//arr[i] = arr[랜덤값];
//arr[랜덤값] = temp;
