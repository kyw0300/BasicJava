package chapter03;

public class Exercise07 {
	public static void main(String[] args) {
		float var1 = 10f;
		float var2 = var1 / 100;
		
		if(var2 == 0.1) { // 0.1f로 하면 가능
			System.out.println("10%입니다.");
		}   else {
			System.out.println("10%가 아닙니다.");
		}
		System.out.println(var2);
	}
}
