package chapter07;

public class InstanceofExample {
	public static void method1(Parent3 parent) {
		if(parent instanceof Child3) {
			Child3 child = (Child3) parent;
			System.out.println("method1 - Child3로 변환 성공");
		} else {
			System.out.println("method1 - Child3로 변환되지 않음");
		}
	}
	public static void method2(Parent3 parent) {
		Child3 child = (Child3) parent;
		System.out.println("method2 - Child3로 변환 성공");
	}
	
	public static void main(String[] args) {
		Parent3 parentA = new Child3();
		method1(parentA);
		method2(parentA);
		
		Parent3 parentB = new Parent3();
		method1(parentB);
		method2(parentB);
	}
}
