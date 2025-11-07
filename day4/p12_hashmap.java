package day4;

import java.util.HashMap;

public class p12_hashmap {

	public static void main(String[] args) {
		HashMap<Integer,String> map = new HashMap<>();
		map.put(1, "item1");
		map.put(2,"item2");
		map.put(3, "item3");
		System.out.println(map);
		map.remove(2);
		System.out.println(map);

	}

}
