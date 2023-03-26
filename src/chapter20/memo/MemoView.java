package chapter20.memo;

import java.util.List;
import java.util.Scanner;

public class MemoView {
	
	public void printMemos(List<MemoVO> list) {
		System.out.println("메모 전체 목록");
		for (MemoVO vo : list) {
			System.out.println(vo);
		}
	}
	
	public MemoVO inoutInsertMemo(Scanner scanner) {
		System.out.print("제목: ");
		String title = scanner.nextLine();
		System.out.print("내용: ");
		String content = scanner.nextLine();
		System.out.print("작성자: ");
		String writer = scanner.nextLine();
		return new MemoVO(title, content, writer);
	}
	
	public void insertResult(int count) {
		if(count > 0) {
			System.out.println("메모가 정상적으로 등록되었습니다.");
		} else {
			System.out.println("메모가 정상적으로 등록되지 않았습니다. 관리자에게 문의하세요.");
		}
	}
	
	public int inputSearchNo(Scanner scanner) {
		System.out.print("메모번호를 입력하세요: ");
		return Integer.parseInt(scanner.nextLine());
	}
	public void printMemo(MemoVO memo) {
		System.out.println(memo);
	}
	
	public int inputDeleteNum(Scanner scanner) {
		System.out.print("삭제할 글 번호 입력: ");
		int num = Integer.parseInt(scanner.nextLine());
		return num;
	}
	public void deleteResult(int count) {
		if(count > 0) {
			System.out.println("삭제가 정상적으로 완료 되었습니다.");
		} else {
			System.out.println("삭제가 정상적으로 완료되지 않았습니다. 관리자에게 문의하세요.");
		}
	}
	
	public int inputUpdateNum(Scanner scanner) {
		System.out.print("수정 할 글 번호 입력: ");
		int updateNum = Integer.parseInt(scanner.nextLine());
		return updateNum;
	}
	public MemoVO inputUpdateMemo(Scanner scanner) {
		System.out.println("수정 할 내용 입력>>>");
		System.out.print("글 번호: ");
		int no = Integer.parseInt(scanner.nextLine());
		System.out.print("수정 할 제목: ");
		String title = scanner.nextLine();
		System.out.print("수정 할 내용: ");
		String content = scanner.nextLine();
		System.out.print("수정 할 작성자: ");
		String writer = scanner.nextLine();
		return new MemoVO(no,title,content,writer);
	}
	public void updateResult(int count) {
		if(count > 0) {
			System.out.println("수정이 정상적으로 완료 되었습니다.");
		} else {
			System.out.println("수정이 정상적으로 완료되지 않았습니다. 관리자에게 문의하세요.");
		}
	}
}
