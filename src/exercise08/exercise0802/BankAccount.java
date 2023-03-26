package exercise08.exercise0802;

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
		if (balance >= amount) {
			otherAccount.deposit(amount);
			return withdraw(amount);
		}
		return false;
	}

	@Override
	public String toString() {
		return String.format("잔액: %,d",balance);
	}
}
