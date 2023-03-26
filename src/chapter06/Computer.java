package chapter06;

public class Computer {
	int sum1(int[] values1) {
		int sum =0;
		for (int i = 0; i < values1.length; i++) {
			sum += values1[i];
		}
		return sum;
	}
	
	int sum2(int ... values2 ) {
		int sum =0;
		for (int i = 0; i < values2.length; i++) {
			sum += values2[i];
		}
		return sum;
	}
}
