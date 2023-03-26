package exercise10.bank10;

public abstract class BankAccount {
	protected int balance;
	
	public BankAccount(int balance) {
		this.balance = balance;
	}
	
	abstract String getAccountType(); //계좌종류 반환 추상메소드

	public int getBalance() {
		return balance;
	}
	public void deposit(int amount) {
		this.balance  += amount;
	}
	public boolean withdraw(int amount) {
		if(balance >= amount) {
			this.balance -= amount;
			return true;		
		}
		return false;
	}
	public boolean transfer(int amount, BankAccount otherAccount) {  
		if(amount<0 || amount>balance) {
			throw new IllegalArgumentException();
		}
		if(otherAccount == null) {
			throw new NullPointerException();
		}
		otherAccount.deposit(amount);
		return withdraw(amount);
		
//		if (balance >= amount) {
//			otherAccount.deposit(amount);
//			return withdraw(amount);
//		}
	}

	@Override
	public String toString() {
		return String.format("잔액: %,d",balance);
	}
}
