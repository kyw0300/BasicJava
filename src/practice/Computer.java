package practice;

public class Computer {
	int sum1(int[] value1) {
		int sum = 0;
		for (int i = 0; i < value1.length; i++) {
			sum += value1[i];
		}
		return sum;
	}
	
	int sum2(int ...value2 ) {
		int sum = 0;
		for (int i = 0; i < value2.length; i++) {
			sum += value2[i];
		}
		return sum;
	}
}
