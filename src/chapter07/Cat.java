package chapter07;

public class Cat extends Animal {
	public Cat() {
		this.kind = "포유";
	}

	@Override
	public void sound() {
		System.out.println("야옹~");
	}
}
