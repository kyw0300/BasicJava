package chapter06;

public class Calculator {
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	
	int plus(int x, int y) {
		
		return x+y;
		//int result = x + y;
		//return result;
		//System.out.println("더하기 완료");
	}
	
	double divide(int x, int y) {
		return (double)x/y;
		//double result = (double) x/y;
		//return result;
		//System.out.println("나누기 완료");
	}
	
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
}
