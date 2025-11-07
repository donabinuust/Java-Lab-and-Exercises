package day4;

import java.util.PriorityQueue;

public class p10_queue {

	public static void main(String[] args) {
		PriorityQueue<String> pq = new PriorityQueue<>();
		pq.add("apple");
		pq.add("banana");
		pq.add("cat");
		pq.add("dog");
		pq.add("eli");
		pq.add("foot");
		System.out.println(pq);
		pq.remove();
		System.out.println(pq);
		pq.remove("dog");
		System.out.println(pq);
		System.out.println("First element: " + pq.peek());
		System.out.println("Size is " + pq.size());
		pq.clear();
		System.out.println("After clearing: " + pq);
	}

}
