package exercise;

public class NewCar {
	private double speed; // 내부적으로 mile 단위
	private String color;
	private final static double MAX_SPEED = killoToMile(200);
	
	public NewCar() { // 생성자
	}
	
	public NewCar(String color) {
		this.color = color;
	}
	
	static double killoToMile(double distance) { // 메소드
		return distance / 1.6;
	}
	static double mileToKillo(double distance) {
		return distance * 1.6;
	}
	
	void setSpeed(double speed) {
		this.speed = killoToMile(speed);	
	}
	void setColor(String color) {
		this.color = color;
	}
	
	double getSpeed() {
		return mileToKillo(speed);
	}
	String getColor() {
		return color;
	}
	
	static double getMaxSpeed() {
		return mileToKillo(MAX_SPEED);
	}
	
	boolean speedUp(double speed) { // 기본초기화값 활용 가능
		speed = killoToMile(speed);
		if(this.speed+speed > 0 && this.speed+speed < MAX_SPEED) {
			this.speed += speed;
			return true;
		} else {
			return true;
		}
	}

	@Override
	public String toString() { // 개발자 습관
		return "NewCar [speed=" + speed + ", color=" + color + "]";
	}
}
