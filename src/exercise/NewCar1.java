package exercise;

public class NewCar1 {
	private double speed;
	private String color;
	private static final double MAX_SPEED = killoToMile(200);
	
	public NewCar1() {
	}
	public NewCar1(String color) {
		this.color = color;
	}
	
	static double killoToMile(double distance) {
		return distance / 1.6;
	}
	static double mileToKillo(double distance) {
		return distance * 1.6;
	}
	
	
	public double getSpeed() {
		return mileToKillo(speed);
	}
	public void setSpeed(double speed) {
		this.speed = killoToMile(speed);
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public static double getMaxSpeed() {
		return mileToKillo(MAX_SPEED);
	}
	public boolean speedUp(double speed) {
		speed = killoToMile(speed);
		if(this.speed+speed > 0 && this.speed+speed < MAX_SPEED) {
			this.speed += speed;
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public String toString() {
		return "NewCar1 [speed=" + speed + ", color=" + color + "]";
	}
}
