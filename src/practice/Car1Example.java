package practice;

public class Car1Example {
	public static void main(String[] args) {
		Car1 car1 = new Car1();
		
		car1.keyTurnOn();
		car1.run();
		int speed = car1.speed;
		System.out.println("현재속도: " + speed);
	}
}
