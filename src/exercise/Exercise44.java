package exercise;

import java.util.Scanner;

public class Exercise44 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("*** 가위 바위 보 게임 ***");
		
		System.out.print("철수: ");
		String chul = scanner.next();
		
		System.out.print("영희: ");
		String young = scanner.next();
		
		if(chul.equals(young)) {
			System.out.println("결과: 무승부!");
		}
		
		if((chul.equals("바위") && young.equals("가위")) || // &&가 ||보다 우선 실행
				(chul.equals("가위") && young.equals("보")) ||
					(chul.equals("보") && young.equals("바위"))) {
			System.out.println("결과: 철수 승리!");
		} else if((young.equals("바위") && chul.equals("가위")) ||
				(young.equals("가위") && chul.equals("보")) ||
					(young.equals("보") && chul.equals("바위"))) {
			System.out.println("결과: 영희 승리!");
		}
	}
}
