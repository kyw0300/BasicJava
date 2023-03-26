package chapter06;

public class MemberService {
	
	boolean login(String id, String password) {
		if("hong".equals(id) && password.equals("12345")) { //equals 앞에 문자열을 쓰는게 더 안정적(null값 들어갈 경우)
			boolean result = true;
			//System.out.println("로그인 되었습니다");
			return result;
		} //return문 일 때만 else문 생략 가능
			boolean result = false;
			//System.out.println("로그인에 실패했습니다.");
			return result;
		
	}
	
	void logout(String id) {
		System.out.println("로그아웃 되었습니다.");
	}
}
