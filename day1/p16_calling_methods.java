class Sampl{
	void m1() {
		System.out.println("This is m1");
		m2();
	}
	void m2() {
		System.out.println("This is m2");
	}
}

public class p16_calling_methods {

	public static void main(String[] args) {
		Sampl obj = new Sampl();
		obj.m1();

	}

}
