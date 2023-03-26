package practice;

public class ComputerExample {
	public static void main(String[] args) {
		Computer computer = new Computer();
		
		int result1 = computer.sum1(new int[] {1, 2, 3, 4, 5, 6});
		
		int result2 = computer.sum2(1, 2, 3, 4, 5, 6, 7);
		
		System.out.println(result1);
		System.out.println(result2);
	}
}
