package exercise08;

public class Novel extends Book {

	public Novel(String title, String author) {
		super(title, author);
	}

	@Override
	public int getLateFee(int lateDay) {		
		return 300 * lateDay;
	}

}
