package chapter06;

import java.util.Iterator;

public class Car4 {
	
	int speed; // 필드
	
	int getSpeed() {
		return speed;
	}
	
	void keyTurnOn() {
		System.out.println("키를 돌립니다");
	}
	
	void run() {
		for (int i = 10; i <= 50; i+=10) {
			speed = i;
			System.out.println("달립니다.(현재속도: " + speed + "km/h)");
		}
	}
}
