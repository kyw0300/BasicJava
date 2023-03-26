package chapter02;

public class OperationsPromotionExample {
	public static void main(String[] args) {
		byte bytevalue1 = 10;
		byte bytevalue2 = 20;
		int intvalue1 = bytevalue1 + bytevalue2;
		System.out.println(intvalue1);
		
		
		char charValue1 = 'A';
		char charValue2 = 1;
		int intvalue2 = charValue1 + charValue2;
		System.out.println("유니코드: " + intvalue2);
		System.out.println("출력문자: " + (char)intvalue2);
		
		
		int intValue3 = 10;
		int intValue4 = intValue3/4;
		System.out.println(intValue4);
		
		
		int intValue5 = 10;
		double doubleValue = intValue5 / 4.0;
		System.out.println(doubleValue);
		
		
		int x = 1;
		int y = 2;
		double result = (double) x/y;
		System.out.println(result);
	}
}
