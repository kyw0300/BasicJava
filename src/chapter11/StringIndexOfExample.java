package chapter11;

public class StringIndexOfExample {
	public static void main(String[] args) {
		String subject = "파이썬 프로그래밍";
		
		int location = subject.indexOf("프로그래밍");
		System.out.println(location);
		
		if(subject.indexOf("자바") != -1) {
			System.out.println("자바와 관련된 책이군요");
		} else {
			System.out.println("자바와 관련없는 책");
		}
		System.out.println(subject.contains("파이썬"));
	}
}
