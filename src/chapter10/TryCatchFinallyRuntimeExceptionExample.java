package chapter10;

public class TryCatchFinallyRuntimeExceptionExample {
	public static void main(String[] args) {
		
		String data1 = null;
		String data2 = null;
		
		try {
			data1 = args[0];
			data2 = args[1];
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(data1);
		System.out.println(data2);
		
		int result = 0;
		try {
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			result = value1 + value2;
			System.out.println("성공적으로 실행 " + result);
		} catch (NumberFormatException e) {
			e.printStackTrace();
			System.out.println("정수로 변환과정 오류");
		} finally {
			System.out.println("finally는 무조건 실행");
		}
		
	}
}
