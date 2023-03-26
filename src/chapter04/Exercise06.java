package chapter04;

public class Exercise06 {
	public static void main(String[] args) {
		
		for (int i = 4 ; i>=1 ; i--) {
			
			for ( int m =1; m<=i-1 ; m++) {
				System.out.print(" ");
			}
			
			for ( int n=1 ; n <=5-i ; n++) {
				System.out.print("*");
			}
			System.out.println();
		}	
	}	
}
