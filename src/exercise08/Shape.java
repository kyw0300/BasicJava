package exercise08;

public abstract class Shape implements Comparable<Shape> {
	public abstract double area();
	public abstract double perimeter();
	
	public int compareTo(Shape o) {
		if(this.area() < o.area()) {
			return -1;
		} else if(this.area() == o.area()) {
			return 0;
		} else {
			return 1;
		}
	}
}
