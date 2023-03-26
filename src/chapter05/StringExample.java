package chapter05;

public class StringExample {
	public static void main(String[] args) {
		String c = "홍길동"; // 효율적
		String d = "홍길동";
		String a = new String("홍길동"); // 비효율적
		String b = new String("홍길동");
		
		System.out.println(c == d);
	}
}
