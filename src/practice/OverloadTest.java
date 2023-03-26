package practice;

public class OverloadTest {
	public static void main(String[] args) {
		new OverloadTest().test();
	}

	private void test() {
		Fruits fruits = new Fruits();
		System.out.println(fruits.getName());
	}
}

