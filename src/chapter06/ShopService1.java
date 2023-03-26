package chapter06;

public class ShopService1 {
	
	private String name;
	
	private static ShopService1 instance = new ShopService1();
	
	public ShopService1() {
		// TODO Auto-generated constructor stub
	}
	
	public static ShopService1 getInstance() {
		return instance;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
}
