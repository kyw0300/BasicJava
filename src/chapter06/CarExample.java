package chapter06;

public class CarExample {
	public static void main(String[] args) {
		//디버깅(Debugging) 
		
		
		
		Car myCar = new Car(); // 객체 생성과 변수 지정
		
		System.out.println("제작회사: " + myCar.company);
		System.out.println("모델명: " + myCar.model);
		System.out.println("색깔: " + myCar.color);
		System.out.println("최고속도: " + myCar.maxSpeed);
		System.out.println("현재속도: " + myCar.speed);
		
		myCar.speed = 60;
		System.out.println("현재속도: " + myCar.speed);
		Car car2 = new Car();
		Car car3 = new Car();
		Car car4 = new Car();
	}
}
