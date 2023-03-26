package practice;

public class BoardExample {
	public static void main(String[] args) {
		
		
		Board board1 = new Board("1Q84", "아오마메");
		Board board2 = new Board("1Q84", "아오마메", "하루키");
		Board board3 = new Board("1Q84", "아오마메", "덴고", "어제");
		Board board4 = new Board("1Q84", "아오마메", "우시카와", "오늘", 999);
		
		System.out.println(board1.title);
		System.out.println(board1.content);
		System.out.println(board1.writer);
		System.out.println(board1.date);
		System.out.println(board1.hitcount);
		
	}
}
