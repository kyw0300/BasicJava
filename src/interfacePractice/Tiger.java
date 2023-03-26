package interfacePractice;

public class Tiger extends Animal implements Predator {

	@Override
	public String getFood() {
		
		return "호랑이먹이";
	}

}
