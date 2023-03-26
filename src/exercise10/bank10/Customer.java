package exercise10.bank10;

public class Customer {
	private String firstName;
	private String lastName;
	private BankAccount[] accounts;
	private int numberOfAccounts; //고객이 보유한 계좌수(최대 5개)
	
	public Customer(String firstName, String lastName) { // 생성자
		this.firstName = firstName;
		this.lastName = lastName;
		accounts = new BankAccount[5];
	}

	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}

	public BankAccount getAccount(int index) {
		return accounts[index];
	}
	
//	public void setAccount(BankAccount account) {
//		this.account = account;
//	}
	

	public void addAccount(BankAccount account) {
		if(numberOfAccounts >= 5) {
			System.out.println("더 이상 계좌를 만들 수 없습니다!");
			return;
		}
		this.accounts[numberOfAccounts] = account;
		numberOfAccounts++;
	}
	
	public int getNumberOfAccounts() {
		return numberOfAccounts;
	}
	
	@Override
	public String toString() {
		return firstName + " " + lastName;
	}	
}
