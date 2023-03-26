package chapter06;

public class Singleton {
	private static Singleton singleton = new Singleton(); // 정적 필드
	
	private Singleton() { // 생성자
	}
	
	static Singleton getInstance() {
		return singleton;
	}
}
