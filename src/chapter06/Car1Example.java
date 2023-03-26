package chapter06;

public class Car1Example {
	public static void main(String[] args) {
		Car1 car1 = new Car1();
		System.out.println(car1.company);
		System.out.println();
		
		Car1 car2 = new Car1("자가용");
		System.out.println(car2.model);
		System.out.println();
		
		Car1 car3 = new Car1("자가용", "빨강");
		System.out.println(car3.model + ", " + car3.color);
		System.out.println();
		
		Car1 car4 = new Car1("택시", "검정", 200);
		System.out.println(car4.model + ", " + car4.color + ", " + car4.maxSpeed);
		System.out.println();
	}
}
