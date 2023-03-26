package chapter03;

public class CompareOperatorExample2 {
	public static void main(String[] args) {
		int v2 = 1;
		double v3 = 1.0;
		System.out.println(v2 == v3);
		
		double v4 = 0.1;
		float v5 = 0.1f;
		System.out.println(v4 == v5);
		System.out.println((float) v4 == v5);
		
		String ko = "고영우";
		String ko1 = "고영우";
		System.out.println(ko.equals(ko1));
		System.out.println(!ko.equals(ko1));
	}
}
