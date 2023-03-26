package chapter04;

public class Exercise02 {
	public static void main(String[] args) {
		int i = 1;
		int sum = 0;
		
		for(i=1; i<=100 ; i++) {
			if(i%3 != 0) {
				continue; //continue 말고는?
			}
			sum += i;
		}
		System.out.println("1부터 " + (i-1) + "까지 3의 배수의 총 합은: " + sum);
	}
}
