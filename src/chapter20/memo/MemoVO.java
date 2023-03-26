package chapter20.memo;

import java.sql.Timestamp;

// VO: Value Object 값을 저장하는 객체
// DTO: Data Transfer Object 저장된 값을 전달하는 객체
// Bean: 자바가 커피원두에서 따온 이름이라 객체를 Bean으로 표현하기도함
// Model: 데이터와 관련된 객체를 Model이라고 부르기도 함
// Item: 각각의 데이터를 표현하는 의미로 아이템이라고 부르기도 함
// JavaBeans 패턴 vs Builder 패턴
// 객체 선언 도구사용이 많음 => Lombok,이클립스는 플러그인 설치해야함(@Data)
//                              Boilerplate code(자바에서 private로 선언해서 생김)를 없애는 역할
public class MemoVO {
	private int no;
	private String title;
	private String content;
	private String writer; //아이디말고 이름이 보여지게 저장할거임
	private Timestamp registerDate;
	private Timestamp modifyDate;
	
	//insert할 때 사용, 나머지는 sql에서 해줌
	public MemoVO(String title, String content, String writer) {
		this.title = title;
		this.content = content;
		this.writer = writer;
	}
	
	//update할 때 사용
	public MemoVO(int no, String title, String content, String writer) {
		this.no = no;
		this.title = title;
		this.content = content;
		this.writer = writer;
	}
	
	//Select할 때 사용
	public MemoVO(int no, String title, String content, String writer, Timestamp registerDate, Timestamp modifyDate) {
		this.no = no;
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.registerDate = registerDate;
		this.modifyDate = modifyDate;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public Timestamp getRegisterDate() {
		return registerDate;
	}

	public void setRegisterDate(Timestamp registerDate) {
		this.registerDate = registerDate;
	}

	public Timestamp getModifyDate() {
		return modifyDate;
	}

	public void setModifyDate(Timestamp modifyDate) {
		this.modifyDate = modifyDate;
	}

	@Override
	public String toString() {
		return String.format("%s\t%s\t%s\t%s\t%s\t%s\n", no, title, content, writer, registerDate, modifyDate); 
	}
}
