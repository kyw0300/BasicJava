package chapter06.package2;

import chapter06.package1.A;
//import chapter06.package1.B;

public class C {
	A a1 = new A(true);
//	A a2 = new A(10);  // default 생성자 접근 불가(다른 package)
//  A a3 = new A("문자열"); // private 생성자 접근 불가
}
