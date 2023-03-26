package interfacePractice;

public class Lion extends Animal implements Predator {
	@Override
	public String getFood() {
		return "사자먹이";
	}
}
