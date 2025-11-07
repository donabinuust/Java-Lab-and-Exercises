package day4;

import java.util.HashSet;
import java.util.Set;

public class p11_sets {

	public static void main(String[] args) {
		Set<String> pq = new HashSet<>();
		pq.add("apple");
		pq.add("banana");
		pq.add("cat");
		pq.add("eli");
		pq.add("eli");
		pq.add("foot");
		System.out.println(pq);
		pq.remove("foot");
		System.out.println(pq);
		pq.remove("cat");
		System.out.println(pq);
		System.out.println("Size is " + pq.size());
		pq.clear();
		System.out.println("After clearing: " + pq);

	}

}
