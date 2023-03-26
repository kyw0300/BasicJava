package chapter05;

public class Exercise05 {
	public static void main(String[] args) {
		int[][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		
		int sum = 0;
		double avg = 0.0;
		
		int num = 0;
		for (int i=0; i<array.length; i++) {
			for (int k : array[i]) {
				sum += k;
			}
		}
		
		for(int m=0; m<array.length; m++) {
			num += array[m].length;
		}
		avg = (double) sum / num;
		
		
		System.out.println("sum: " + sum);
		System.out.println("avg: " + avg);
	}
}
