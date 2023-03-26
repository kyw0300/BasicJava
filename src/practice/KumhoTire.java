package practice;

public class KumhoTire extends Tire {
	public KumhoTire(String location, int max) {
		super(location,max);
	}
	
	@Override
	public boolean roll() {
		++age;
		if(age < max) {
			System.out.println(location + " 금호타이어 수명: " + (max-age));
			return true;
		} 
		System.out.println(location + "금호타이어 펑크");
		return false;
	}
}
