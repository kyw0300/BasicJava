package practice;

import java.util.Iterator;

public class CarExample {
	public static void main(String[] args) {
		Car car = new Car();
		
		for(int i=1; i<=5 ; i++) {
			int problemNum = car.run();
			
			switch (problemNum) {
			case 1:
				car.fl = new KumhoTire("앞왼쪽타이어", 15);
				break;
			case 2:
				car.fr = new KumhoTire("앞오른쪽타이어", 16);
				break;
			case 3:
				car.bl = new KumhoTire("뒤왼쪽타이어", 17);
				break;
			case 4:
				car.br = new KumhoTire("뒤오른쪽타이어", 14);
				break;
			}
			System.out.println("-------------------------------");
		}
	}
}
