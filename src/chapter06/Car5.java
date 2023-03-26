package chapter06;

public class Car5 {
	int speed;
	
	void run() {
		System.out.println(speed + "으로 달립니다.");
	}
	
	public static void main(String[] args) {
		Car5 car5 = new Car5();
		car5.speed = 60;
		car5.run();
	}
}
