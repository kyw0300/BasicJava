package chapter13;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 95);
		System.out.println("총 Entry 수: " + map.size());
		
		//객체 찾기
		System.out.println("홍길동 : " + map.get("홍길동"));
		System.out.println();
		
		// 1. Entry로 접근
		Set<Entry<String,Integer>> entrySet = map.entrySet();
//		entrySet.iterator(); => while문으로 접근
		Iterator<Entry<String, Integer>> entryiterator = entrySet.iterator();
		while (entryiterator.hasNext()) {
			Entry<String, Integer> entry = entryiterator.next();
			System.out.println(entry.getKey() + ": " + entry.getValue());
			
		}
//		entrySet => foreach문으로 접근
		System.out.println();
		for (Entry<String, Integer> entry : entrySet) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
		// 2. key으로 접근
		Set<String> keySet = map.keySet();
		for (String key : keySet) {
			System.out.println(map.get(key));
		}
		// 3. values로 접근 => 키 값은 모름
		Collection<Integer> values = map.values();
		for (Integer integer : values) {
			System.out.println(integer);
		}
	}
}
