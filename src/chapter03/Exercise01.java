package chapter03;

public class Exercise01 {
	public static void main(String[] args) {
		byte b = 5;
		b = (byte) -b; // int b = -b; 는 왜 오류??
		int result = 10 / b;
		System.out.println(result);
	}
}
