package chapter06;

public class PersonExample {
	public static void main(String[] args) {
		Person person = new Person("123456-1234567", "KOKOKURI");
		
		System.out.println(person.nation);
		System.out.println(person.ssn);
		System.out.println(person.name);
		System.out.println();
		
		
//		person.ssn = "123123";
		
		person.name = "고고구리";
		System.out.println(person.name);
	}
}
