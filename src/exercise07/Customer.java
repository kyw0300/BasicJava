package exercise07;

public class Customer {
	private String firstName;
	private String lastName;
	private BankAccount account; // 고객이 소유한 계좌, BankAccount 객체생성
	
	public Customer(String firstName, String lastName) { // 생성자
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}

	public BankAccount getAccount() {
		return account;
	}
	public void setAccount(BankAccount account) {
		this.account = account;
	}
	
	@Override
	public String toString() {
		return String.format("이름: %s %s, 잔고: %,d원",firstName,lastName,account.getBalance());
				//"이름: " + firstName + " " + lastName + ", 잔고: " + account.getBalance() + "원";
	}
	
}
