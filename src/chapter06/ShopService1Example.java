package chapter06;

public class ShopService1Example {
	public static void main(String[] args) {
		ShopService1 obj1 = ShopService1.getInstance();
		ShopService1 obj2 = ShopService1.getInstance();
		System.out.println(obj1 == obj2);
		
		obj1.setName("고영우");
		//obj1.name = "고"; 이런거 방지 private
		System.out.println(obj1.getName());
	}
}
