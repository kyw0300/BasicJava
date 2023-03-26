package practice;

public class CalculatorExample {
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		
		int result1 = cal.plus(8, 9);
		double result2 = cal.avg(8, 9);
		
		System.out.println(result1);
		System.out.println(result2);
		cal.execute();
	}
}
