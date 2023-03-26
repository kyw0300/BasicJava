package exercise;

public class Exercise51 {
	public static void main(String[] args) {
		
		int[] num = {38, 94, 16, 3, 76, 94, 82, 47, 59, 8};
		
		int max = 0; //Integer.max_value; 추천
		int min = num[0];
		
		for(int i=0; i < num.length; i++) {
			if(max < num[i]) {
				max = num[i];
			}
			if(min > num[i]) {
				min = num[i];
			}
		}
		System.out.println("최대값: " + max);
		System.out.println("최소값: " + min);
	}
}
