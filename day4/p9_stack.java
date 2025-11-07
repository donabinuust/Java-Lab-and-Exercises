package day4;

import java.util.Stack;

public class p9_stack {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		System.out.println(stack);
		stack.push("one");
		stack.push("two");
		stack.push("three");
		System.out.println(stack);
		stack.pop();
		System.out.println(stack);
		System.out.println(stack.peek());
		System.out.println(stack.size());
	}

}
