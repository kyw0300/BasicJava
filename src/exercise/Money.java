package exercise;

public class Money {
	public String country = "unknown";

	public String getCountry() {
		return country;
	}

	public static void main(String[] args) {
		Won won = new Won();
		Euro euro = new Euro();
		Money money = new Won();
		System.out.println(won.getCountry());
		System.out.println(euro.getCountry());
		System.out.println(money.getCountry());
	}
}

class Won extends Money {
	private String country = "Korea";

	public String getCountry() {
		return country;
	}
}

class Euro extends Money {
	private String country = "Spain";

	public String getCountry(int x) {
		return country;
	}
}
