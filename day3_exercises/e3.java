package day3_exercises;

class Counter{
	static int count=0;
	Counter(){
		count++;
		System.out.println(count);
	}
}

public class e3 {
	public static void main(String[] args) {
		new Counter();
		new Counter();
		new Counter();
		new Counter();
		new Counter();
		new Counter();
		
	}
}
