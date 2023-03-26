package chapter06;

public class ShopServiceExample {
	public static void main(String[] args) {
		ShopService obj1 = ShopService.getInstance();
		ShopService obj2 = ShopService.getInstance();
		System.out.println(obj1 == obj2);
		
		obj1.setName("고영우");
		System.out.println(obj1.getName());
	}
}
