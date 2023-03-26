package chapter06;

public class MemberExample1 {
	public static void main(String[] args) {
		Member member = new Member(); //  클래스에 생성되어 있던 Member() {} 생성자 호출
		
		member.name = "고영우";
		member.age = 29;
		
		System.out.println("이름: " + member.name);
		System.out.println("나이: " + member.age);
	}
}
