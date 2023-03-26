package chapter11;

import java.util.HashMap;

public class KeyExample {
	public static void main(String[] args) {
		
		HashMap<Key, String> hashMap = new HashMap<Key, String>();
		HashMap<Key, String> hashMap1 = new HashMap<Key, String>();
		
		hashMap.put(new Key(1), "홍길동");
		hashMap1.put(new Key(1), "고영우");
		
		String value = hashMap.get(new Key(1));
		String value1 = hashMap1.get(new Key(1));
		System.out.println(value);
		System.out.println(value1);
		
		System.out.println(hashMap.hashCode());
		System.out.println(hashMap1.hashCode());
	}
}
