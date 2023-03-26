package practice;

public class PersonExample {
	public static void main(String[] args) {
		Person person = new Person("123456-1234567", "gogoguri");
		String result1 = person.ssn;
		String result2 = person.name;
		System.out.println(result1);
		System.out.println(result2);
		
//		person.ssn = "123";
		person.name = "고고구리";
		System.out.println(person.name);
	}
}
