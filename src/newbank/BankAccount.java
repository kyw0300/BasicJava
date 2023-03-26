package newbank;

public class BankAccount {
	protected int balance; // 잔액
	
	public BankAccount(int balance) { // 잔액충전 생성자
		this.balance = balance;
	}

	public int getBalance() { //잔액 반환
		return balance;
	}
	public void deposit(int amount) { //입금
		this.balance  += amount;
	}
	public boolean withdraw(int amount) { //출금
		if(balance >= amount) {
			this.balance -= amount;
			return true;		
		}
		return false;
	}
	public boolean transfer(int amount, BankAccount otherAccount) {  //송금
		//현재 계좌에서 amount만큼을 다른 계좌로 송금하는 메소드, '현재 계좌'를 딱 어떻게 뽑는지
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
