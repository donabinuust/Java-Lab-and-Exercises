package exercises;

class testing{
	void m1() {
		System.out.println("m1 is running");
		m2();
	}
	void m2() {
		System.out.println("m2 is running");
		m3();
	}
	void m3() {
		System.out.println("m3 is running");
	}
}

public class e17 {

	public static void main(String[] args) {
		testing obj = new testing();
		obj.m1();

	}

}
