package practice;

public class Calculator {
	int plus(int x, int y) {
		return x + y;
	}
	
	double avg(int x, int y) {
		int sum1 = plus(x,y);
		return (double) sum1 / 2;
	}
	
	void execute() {
		double result = avg(7,10);
		printgogo("실행결과: " + result);
	}
	
	void printgogo(String msg ) {
		System.out.println(msg);
	}
}
