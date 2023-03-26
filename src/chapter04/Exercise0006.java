package chapter04;

public class Exercise0006 {
	public static void main(String[] args) {
		String sum =  "";
		
		for(int i=1 ; i<=4 ; i++) {
			for(int j=4-i ; j>=0 ; j--) { //j=4-i로
				if(j>=i) {
					sum += " ";	
				} else if(j<i) {
					sum += "*";
				}
			}
			sum += "\n";
			
		}
		System.out.println(sum);	
			
	}
}
