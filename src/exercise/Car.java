package exercise;

public class Car {
	private double speed;
	private String color;
	private static final double MAX_SPEED = 200;
	
	public Car() {
	}
	
	public Car(String color) { // 생성자
		this.color = color;
	}
	
	void setSpeed(double speed) { // 메소드
		this.speed = speed;
	}
	void setColor(String color) {
		this.color = color;
	}
	
	double getSpeed() {
		return speed;
	}
	String getColor() {
		return color;
	}
	
	static double getMaxSpeed() {
		return MAX_SPEED;
	}
	
	boolean speedUp(double speed) { // 기본초기화값 활용 가능
		if(this.speed+speed > 0 && this.speed+speed < MAX_SPEED) {
			this.speed += speed;
			return true;
		} else {
			return true;
		}
	}

	@Override
	public String toString() {
		return "Car [speed=" + speed + ", color=" + color + "]";
	}
}
