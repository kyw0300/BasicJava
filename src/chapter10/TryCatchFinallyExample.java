package chapter10;

public class TryCatchFinallyExample {
	public static void main(String[] args) {
		try {
			System.out.println("실행시작");
			Class clazz = Class.forName("java.lang.String2");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("오류발생");
		} finally {
			System.out.println("무조건 실행 finally");
		}
	}
}
