package chapter06;

public class GoGoExample {
	public static void main(String[] args) {
		GoGo gogo = new GoGo();
		gogo.getName("고영우");
		System.out.println(gogo.name);
		
		
		gogo.getNumber(10);
		System.out.println(gogo.number);
		
		gogo.run();
		
		System.out.println(gogo.name);
		System.out.println(gogo.number);
	}
}
