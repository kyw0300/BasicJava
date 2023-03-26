package chapter03;

public class Exercise10 {
	public static void main(String[] args) {
		int var1 = 10;
		int var2 = 3;
		int var3 = 14;
		
		String pi = var2 + "." + var3;
		double pii = Double.parseDouble(pi);
		//double pi = Double.parseDouble(var2 + "." + var3);
		//이렇게 한 줄로 가능
		
		double var4 = var1 * var1 * pii;
		System.out.println("원의 넓이: " + var4);
	}
}
