package newbank;

public class Bank {
	private Customer[] customers;
 	private int numberOfCustomers; //은행의 고객 수
	
	public Bank() {// 생성자, customers의 배열 크기를 10으로 초기화
		this.customers = new Customer[10];
	}
	
	public void addCustomer(Customer customer) { 
		//인자로 받은 customer를 customers배열에 할당, 이후에 numberOfCustomers값 1증가
		customers[numberOfCustomers] = customer;
		numberOfCustomers++;
	}
	
	public int getNumberOfCustomers() {
		return numberOfCustomers;
	}
	public Customer[] getCustomers() {
		return customers;
	}
	public Customer getCustomer(int index) { //배열의 index번째 고객객체를 반환
		return customers[index];
	}
}
