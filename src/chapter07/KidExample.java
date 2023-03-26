package chapter07;

public class KidExample {
	public static void main(String[] args) {
		Kid kid = new Kid();
		Mom mom = kid;
		
		kid.method1();
		kid.method2();
		kid.method3();
		
		mom.method1();
		mom.method2(
				);
//		mom.method3();
	}
}
