package practice;

public class HankookTire extends Tire {
	public HankookTire(String location, int max) {
		super(location,max);
	}
	
	@Override
	public boolean roll() {
		++age;
		if(age < max) {
			System.out.println(location + " 한국타이어 수명: " + (max-age));
			return true;
		} 
		System.out.println(location + "한국타이어 펑크");
		return false;
	}
}
