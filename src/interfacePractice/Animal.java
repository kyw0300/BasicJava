package interfacePractice;

public class Animal implements Predator {
	String name; //필드
	
	void setName(String name) { //생성자
		this.name = name;	
	}

	@Override
	public String getFood() {
		// TODO Auto-generated method stub
		return null;
	}
}
