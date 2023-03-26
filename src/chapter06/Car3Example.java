package chapter06;

public class Car3Example {
	public static void main(String[] args) {
		Car3 myCar = new Car3();
		myCar.setGas(5);
		System.out.println("가스 충전 잔량: " + myCar.gas);
		boolean gasState = myCar.isLeftGas();
		if(gasState) {
			System.out.println("출발합니다 부릉부릉");
			myCar.run();
		}
		
		if(myCar.isLeftGas()) {
			System.out.println("gas를 주입할 필요가 없습니다.");
		} else {
			System.out.println("gas를 주입하세요.");
		}
	}
}
