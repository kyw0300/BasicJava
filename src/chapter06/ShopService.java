package chapter06;

public class ShopService {
	private String name;
	private static ShopService instance = new ShopService();
	
	public ShopService() {
	}
	
	public static ShopService getInstance() {
		return instance;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
}
