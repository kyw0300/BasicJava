package exercise;

import java.util.Random;
import java.util.Scanner;

public class Exercise53 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		String[] com = {"가위", "바위", "보"};
		int ranNum = random.nextInt(3);
		
		System.out.print("가위 바위 보를 입력하세요: ");
		String me = scanner.nextLine();
		String result = "";
		
		System.out.println("게이머: " + me);
		System.out.println("인공지능 컴퓨터: " + com[ranNum]);
		
		if(me.equals(com[ranNum])) {
			System.out.println("결과: 무승부!");
		} else if((me.equals("바위") && (com[ranNum]).equals("가위")) || // &&가 ||보다 우선 실행
				(me.equals("가위") && (com[ranNum]).equals("보")) ||
					(me.equals("보") && (com[ranNum]).equals("바위"))) {
			result = "결과: 게이머 승리!";
		} else  {
			result = "결과: 인공지능 컴퓨터 승리!";
		}
		System.out.println(result);
	}
}
