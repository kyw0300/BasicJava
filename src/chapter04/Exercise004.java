package chapter04;

public class Exercise004 {
	public static void main(String[] args) {
		System.out.println("4x + 5y = 60 의 해 구하기");
		for(int x = 1 ; x<=10 ; x++) {
			for(int y = 1 ; y<=10 ; y++) {
				
				if(4*x+5*y==60) {
					System.out.println("(" + x + "," + y + ")");
				}
			}
		}
	}
}
