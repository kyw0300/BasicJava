

package chapter06.package1;

public class A {
	//필드 선언 동시에 생성자로 초기화
	A a1 = new A(true);
	A a2 = new A(1);
	A a3 = new A("문자열");
	
	public A(boolean b) { // 생성자
	}
	
	A(int b) {
	}
	
	private A(String s) {
	}
}
