package chapter07;

public class StudentExample {
	public static void main(String[] args) {
		Student student = new Student("고영우", "950725-1******", 2014161007);
		
		 System.out.println("이름: " + student.name);
		 System.out.println("주민등록번호: " + student.ssn);
		 System.out.println("학번: " + student.studentNo);
	}
}
