package exercise08;

public abstract class Book {
	private int number; //관리번호
	private String title;
	private String author;
	private static int countOfBooks = 0;
	//int lateDay = 7;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
		this.number = ++countOfBooks;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	public boolean equals(Object obj) { // Object클래스는 모든 클래스의 부모 가능
		//주소가 같으면 같은 객체
		if(this==obj) {
			return true;
		}
		if(!(obj instanceof Book)) {
			return false;	
		}
		Book book = (Book) obj;
		return title.equals(book.title) && this.author.equals(book.author);
	}
	
	public abstract int getLateFee(int lateDay); // 연체료계산 추상메소드

	@Override
	public String toString() {
		return String.format("관리번호 %d번, 제목: %s, 작가: %s(일주일 연체료: %,d원)",
				getNumber(), getTitle(), getAuthor(), getLateFee(7));
	}
}
