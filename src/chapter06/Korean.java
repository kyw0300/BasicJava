package chapter06;

public class Korean {
	//필드
	String nation = "대한민국";
	String name;
	String ssn;
	
	Korean(String name, String ssn) { //생성자
		this.name = name; //this. 의미
		this.ssn= ssn;
	}
}
//Design pattern: Telescoping Constructor Pattern ?????