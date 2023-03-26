package exercise08.exercise0802;

public class CheckingAccount extends BankAccount {
	SavingsAccount protectedBy; // SavingsAccount 객체 선언
	
	public CheckingAccount(int balance) { // 생성자
		super(balance);
	}
	public CheckingAccount(int balance, SavingsAccount protectedBy) {
		super(balance);
		this.protectedBy = protectedBy;
	}
	
	@Override
	public boolean withdraw(int amount) {
	/* 만약 잔액보다 더 많은 값을 인출하려고 하면 초과되는 만큼의 돈을
	 참조하고 있는 SavingAccount 객체에서 인출 */
		if(balance >= amount) { // 두 계좌잔액 합보다 큰값 인출 시도시 어떻게 최적화?
			this.balance -= amount;
			return true;		
		}
		protectedBy.balance -= (amount - this.balance);
		this.balance = 0;
		return false;
	}
	
	@Override
	String getAccountType() { //당좌예금 반환
		return "당좌예금";
	}
}
