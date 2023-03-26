package chapter06;

public class KoreanExample {
	public static void main(String[] args) {
		Korean k1 = new Korean("박자바", "950725-13153215");
		Korean k2 = new Korean("김자바", "123456-1234567");
		
		System.out.println(k1.name);
		System.out.println(k1.ssn);
		System.out.println(k2.name);
		System.out.println(k2.ssn);
	}
}
