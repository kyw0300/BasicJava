package chapter06;

public class Car2 {
	//필드
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	//생성자
	Car2() {
		this(null,null,0);
	}
	
	Car2(String model) {
		//this(model, "은색", 250);
		this.model = model;
		this.color = "은색";
		this.maxSpeed = 300;
	}
	
	Car2(String model, String color) {
		this(model, color, 250);
	}
	
	Car2(int maxSpeed, String model, String color) {
		this(model,color,maxSpeed);
	}
	
	Car2(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
		System.out.println("자동차 생성");
	    System.out.println(model + "생성");
	    System.out.println(color + "생성");
	    System.out.println("최대속도: " + maxSpeed);
	}
}
