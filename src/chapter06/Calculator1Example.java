package chapter06;

public class Calculator1Example {
	public static void main(String[] args) {
		Calculator1 cal1Ex = new Calculator1();
		
		int result1 = cal1Ex.plus(3, 8);
		System.out.println(result1);
		
		double result2 = cal1Ex.avg(5, 6);
		System.out.println("plus메서드가 실행된 후 계산된 평균 값: " + +result2);
		
		//cal1Ex.execute();
		
		cal1Ex.println("오잉");
		
		cal1Ex.execute();
	}
}
