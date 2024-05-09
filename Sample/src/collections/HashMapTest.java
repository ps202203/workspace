package collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
	public static void main(String[] args) {
		Map<Integer, String> mymap = new HashMap<>();
		mymap.put(1, "hello");
		mymap.put(3, "java");
		mymap.put(2, "world");
		
		System.out.println(mymap.toString());
		
		for(Integer key : mymap.keySet()) {
			System.out.println(mymap.get(key));
		}
	}
}
