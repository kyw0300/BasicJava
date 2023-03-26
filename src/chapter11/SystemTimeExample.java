package chapter11;

public class SystemTimeExample {
	public static void main(String[] args) {
	
		long time1 = System.nanoTime();
		
		int sum = 0;
		for(int i=1; i<=1000000; i++) {
			sum += i;
		}
		
		long time2 = System.nanoTime();
		
		System.out.println("1 ~ 1000000까지 합: " + sum);
		System.out.println("계산에 걸린 시간: " + (time2-time1));
	}
}
