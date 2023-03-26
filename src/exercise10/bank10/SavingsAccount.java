package exercise10.bank10;

public class SavingsAccount extends BankAccount {
	private double interestRate; // 이자율
	
	public SavingsAccount(int balance, double interestRate) { 
	// 잔액과 이자율필드를 초기화,
	//이 때 상속받은 balance 필드는 슈퍼클래스의 생성자를 호출해서 초기화
		super(balance);
		this.interestRate = interestRate;
	}
	
	public void updateBalance(int period) { // 메소드
	// 저축기간을 인자로 받아 이자를 계산하여 잔액에 추가
	// 저축기간: 월 단위, 이자: 단리법(단리 원리금 = 원금*이율*기간 + 원금)
		this.balance += balance * interestRate * period;
	}
	
	@Override
	String getAccountType() { //저축예금 반환
		return "저축예금";
	}
}
