package exercise07;

public class ShapeTest {
	public static void main(String[] args) {
		Shape[] shapes = new Shape[3]; //배열로도 생성가능
		shapes[0] = new Circle(1.0);
		shapes[1] = new Triangle(2.0);
		shapes[2] = new Rectangle(2.0, 3.0);
		for (Shape shape : shapes) {
			System.out.println(shape);
		}
	}
}
