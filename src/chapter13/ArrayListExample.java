package chapter13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		//ArrayList<String> list1 = new ArrayList<>(); //부모타입으로 선언, 초
		//List<String> list3 = Arrays.asList(null); //고
		
		List<String> list = new ArrayList<>(); //중
		
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2,"Database");
		list.add("iBATIS");
		System.out.println(list.size());
		
		System.out.println(list.get(2));
	}
}
