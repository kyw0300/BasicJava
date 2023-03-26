package practice;

public class Car {
	Tire fl = new Tire("앞왼쪽", 2);
	Tire fr = new Tire("앞오른쪽", 3);
	Tire bl = new Tire("뒤왼쪽", 4);
	Tire br = new Tire("뒤오른쪽", 5);
	
	public int run() { //roll() 메소드 실행, 펑크나면 위치값 반환
		System.out.println("자동차 출발!");
		if(fl.roll() == false) { stop(); return 1; }
		if(fr.roll() == false) { stop(); return 2; }
		if(bl.roll() == false) { stop(); return 3; }
		if(br.roll() == false) { stop(); return 4; }
		return 0;
	}
	
	public void stop() {
		System.out.println("펑크나서 정지!!");
	}
}
