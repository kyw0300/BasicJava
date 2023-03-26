package chapter06;

public class BoardExemple {
	public static void main(String[] args) {
		Board board1 = new Board("보드1", "컨텐츠1");
		Board board2 = new Board("보드2", "컨텐츠2", "아이디2");
		Board board3 = new Board("보드3", "컨텐츠3", "아이디3", "날짜3");
		Board board4 = new Board("보드4", "컨텐츠4", "아이디4", "날짜4", 9999);
	}
}
