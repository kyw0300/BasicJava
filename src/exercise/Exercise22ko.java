package exercise;

public class Exercise22ko {
	public static void main(String[] args) {
		
		double distance = 40e12; //km
		double lightspeed = 3e5; //km/s
		double lightspeed1 = 3e5 * 3600 * 24 * 365; //광년
				
		double time = distance / lightspeed1;
		System.out.println("빛의 속도로 프록시마 센타우리 "
				+ "별까지 가는데 걸리는 시간은 " + time + "광년이다.");
	}
}
