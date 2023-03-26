package chapter13.exercise07;

import java.util.List;

import chapter05.StringEqualsExample;

public class ListExample {
	public static void main(String[] args) {
		BoardDao dao = new BoardDao();
		List<Board> list = dao.getBoardList();
		for (Board board : list) {
			System.out.println(board.getTitle() + " - " + board.getContent());
		}
	}
}
