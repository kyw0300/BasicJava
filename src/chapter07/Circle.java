package chapter07;

public class Circle {
	private double radius;
	private double x;
	private double y;
	
	public Circle() {
	}
	
	public double getArea() {
		return getRadius() * getRadius() * Math.PI;
	}
	
	public void setRadius(double radius) {
		if(radius < 0) {
			this.radius = 0;
			return;
		}
		this.radius = radius;
	}
	public void setX(double x) {
		this.x = x;
	}
	public void setY(double y) {
		this.y = y;
	}
	
	public double getRadius() {
		return radius;
	}
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
}
