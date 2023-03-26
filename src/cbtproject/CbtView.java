package cbtproject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CbtView {
	Scanner scanner = new Scanner(System.in);
	
	public int inputSubjectId(Scanner scanner) {
		System.out.println("**응시 할 과목을 입력하세요**");
		System.out.println("[1]: 소프트웨어 설계");
		System.out.println("[2]: 소프트웨어 개발");
		System.out.println("[3]: 데이터베이스 구축");
		System.out.println("[4]: 프로그래밍 언어 활용");
		System.out.println("[5]: 정보시스템 구축 관리");
		System.out.println("[0]: 전체 과목 응시");
		System.out.print("과목 입력>> ");
		return Integer.parseInt(scanner.nextLine());
	}
	
	public List printQuestions(List<CbtVO> list) {
		System.out.println();
		System.out.println("[시험 시작]");
		List<String> ansList = new ArrayList<>();
		
			for(int i=0; i<list.size(); i++ ) {
				System.out.print((i+1)+ ". " + list.get(i));
				System.out.println("");
				System.out.println("");
				System.out.print("정답: ");
				String ans = scanner.nextLine(); 
				ansList.add(null);
				ansList.set(i, ans);
				
				
				System.out.println();
			}
			return ansList;			
	}
	
	public void printQuestion(CbtVO vo) {
		System.out.println(vo);
	}
	
	public void insertResult(int count) {
		if(count > 0) {
			System.out.println("응시정보가 정상적으로 등록되었습니다.");
		} else {
			System.out.println("응시정보가 정상적으로 등록되지 않았습니다. 관리자에게 문의하세요.");
		}
	}
	
	public void insertScoreResult(int count) {
		if(count > 0) {
			System.out.println("점수가 정상적으로 등록되었습니다.");
		} else {
			System.out.println("점수가 정상적으로 등록되지 않았습니다. 관리자에게 문의하세요.");
		}
	}
	
	public void insertSubmitResult(int count) {
		if(count > 0) {
			System.out.println("제출이 정상적으로 완료되었습니다.");
		} else {
			System.out.println("제출이 정상적으로 완료되지 않았습니다. 관리자에게 문의하세요.");
		}
	}
	
	public void insertWAnswer(int count) {
		if(count > 0) {
			System.out.println("오답문제가 정상적으로 등록되었습니다.\n");
		} else {
			System.out.println("오답문제가 정상적으로 등록되지 않았습니다. 관리자에게 문의하세요.\n");
		}
	}
}
