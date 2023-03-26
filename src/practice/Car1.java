package practice;

public class Car1 {
	int speed;
	
	void getSpeed(int speed) {
		this.speed = speed;
	}
	
	void keyTurnOn() {
		System.out.println("키를 돌립니다");
	}
	
	void run() {
		for (int i = 10; i <= 60; i+=10) {
			speed = i;
			System.out.println("달립니다.(시속 " + speed + "km/h)");
		}
	}
}
