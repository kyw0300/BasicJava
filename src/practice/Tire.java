package practice;

public class Tire {
	
	public String location;
	public int max;
	public int age;
	
	public Tire(String location, int max) { // 생성자
		this.location = location;
		this.max = max;
	}
	
	public boolean roll() { // 타이어 굴리는 메소드
		++age;
		if(age < max) {
			System.out.println(location + " 타이어 수명: " + (max-age));
			return true;
		} 
		System.out.println(location + "타이어 펑크 비상!!");
		return false;
	}
}
