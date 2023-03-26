package chapter05;

public class Exercise04 {
	public static void main(String[] args) {
		int max = 0;
		int[] array = { 1, 5, 3, 8, 2 };
		for(int i=0 ; i<array.length; i++) {
			if(array[i] > max) {
				max = array[i];
			}
			
//			for(int k=0; k<array.length; k++) {
//				if(array[i] >= array[0] && array[i] >= array[1] && 
//					array[i] >= array[2] && array[i] >= array[3] &&
//					array[i] >= array[4]) {
//					max=array[i];
//				}
//			}
		}
		System.out.println("max: " + max);
	}
}
