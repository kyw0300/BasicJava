package chapter11;

public class BoxingUnBoxingExample {
	public static void main(String[] args) {
		
		Integer b = new Integer("10"); //박싱
		int bb = b.intValue(); //언박싱
		Boolean c = new Boolean(false);
		
		//자동 박싱, 자동 언박싱
		Integer d = 10;
		int e = new Integer(10);
		System.out.println(1001*500);
	}
}
