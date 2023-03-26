package chapter06;

public class GoGo {
	//GoGo gogo = new GoGo("고고구리");
	String name;
	int number;
	
	public GoGo() {
		//this.name = name;
	}
	
	void getName(String name) {
		this.name = name;
	}
	
	void getNumber(int number) {
		this.number = number;
	}
	
	void run() {
		for (int i = 10; i <= 50; i+=10) {
			getNumber(i);
			System.out.println(this.name + "달립니다.(현재속도: " + this.number + "km/h)");
		}
	}
}
