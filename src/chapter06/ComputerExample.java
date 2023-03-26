package chapter06;

public class ComputerExample {
	public static void main(String[] args) {
		Computer computer1 = new Computer();
		
		int[] values1 = {1, 2, 3, 4, 5};
		int result1 = computer1.sum1(values1);
		System.out.println(result1);
		
		int result2 = computer1.sum2(new int[]{1,2,3,4,5});
		System.out.println(result2);

		int result3 = computer1.sum2(1,2,3,4);
		System.out.println(result3);
		
		int result4 = computer1.sum2(1,2,3,4,5,6);
		System.out.println(result4);
	}
}
