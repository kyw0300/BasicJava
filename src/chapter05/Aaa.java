package chapter05;

public class Aaa {
	public static void main(String[] args) {
//		int[] scores = { 83, 90, 87 };
//		
//		int sum = 0;
//		for(int i=0; i<scores.length; i++) {
//			sum += scores[i];
//		}
//		System.out.println("총 합: " + sum);
//		
//		double avg = (double) sum / scores.length;
//		System.out.println("평균: " + avg);
		
		int[][] scores = new int[2][];
		scores[0] = new int[2];
		scores[1] = new int[3];
		
		int a = scores.length;
		int b = scores[0].length;
		int c = scores[1].length;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}
