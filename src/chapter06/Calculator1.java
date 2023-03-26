package chapter06;

public class Calculator1 {
	
	int plus(int x, int y) { // plus 메소드
		int result = x + y;
		return result;
	}
	
	double avg(int x, int y) {
		double sum = plus(x,y);
		System.out.println("avg메소드를 불러서 plus메소드가 실행된 값: " + sum);
		double result = sum / 2;
		return result;
	}
	
	void execute() {
		double result = avg(7,10);
		println("실행결과: " + result);
	}
	
	void println(String message) {
		System.out.println(message);
	}
}
