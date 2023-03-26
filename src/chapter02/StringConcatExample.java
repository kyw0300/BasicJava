package chapter02;

public class StringConcatExample {
	public static void main(String[] args) {
		int value = 10 + 2 + 8;
		System.out.println("value: " + value);
		
		String str1 = 10 + 2 + "8";
		System.out.println("str1: " + str1);
		
		String str2 = 10 + "2" + 8;
		System.out.println("str2: " + str2);
		
		String str3 = "10" + 2 + 8;
		System.out.println("str3: " + str3);
		
		String str4 = "10" + (2 + 8);
		System.out.println("str4: " + str4);
		
		// String.valueOf(100) or 100+"" 둘 다 문자로 변환
		
		
		long var1 = 2L;
		float var2 = 1.8f;
		double var3 = 2.5;
		String var4 = "3.9";
		int result = (int)(var1 + var2 + var3) + (int)Double.parseDouble(var4);
		System.out.println(result);
		
	}
}
