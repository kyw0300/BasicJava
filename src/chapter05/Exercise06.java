package chapter05;

import java.util.Scanner;

public class Exercise06 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		
		while(run) {
			System.out.println("------------------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("------------------------------------------------------");
			System.out.print("선택> ");
			
			int selectNo = Integer.parseInt(scanner.nextLine());
			
			if(selectNo == 1) {
				System.out.print("학생수> ");			
				studentNum = Integer.parseInt(scanner.nextLine());
				scores = new int[studentNum];
			} else if(selectNo == 2) {
				for(int i=0; i<scores.length; i++) {
					System.out.print("scores[" + i + "]> ");
					scores[i] = Integer.parseInt(scanner.nextLine()); 
					// scanner.nextInt()로 하면 왜 오류???
					// scanner.nextInt()로 통일해야함
					// Integer.parseInt(scanner.nextLine())로 받고 필요할때마다 바꿔주는게 효과적
					// 숫자랑 문자 같이 받는경우 많음
				}
			} else if(selectNo == 3) {
				for(int i=0; i<scores.length; i++) {
					System.out.println("scores[" + i + "]> " + scores[i]);
				}
			} else if(selectNo == 4) {
				
				int max=0;
				for(int i=0 ; i<scores.length; i++) {
					if(max < scores[i]) {
						max = scores[i];
					}
				}
				System.out.println("최고 점수: " + max);
				
				
				int sum = 0;
				for (int i : scores) {
					sum += i;
				}
				double avg = (double) sum / scores.length;
				System.out.println("평균 점수: " + avg);
			} else if(selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}
}
