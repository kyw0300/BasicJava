package exercise08;

public class Poet extends Book {

	public Poet(String title, String author) {
		super(title, author);
	}

	@Override
	public int getLateFee(int lateDay) {		
		return 200 * lateDay;
	}

}
