package chapter07;

public class Bus extends Vehicle {
	//String busbus = "버스클래스필드";
	@Override
	public void run() {
		System.out.println("버스가 달립니다");
	}
	
	public void busRun() {
		System.out.println("버스런");
	}
}
