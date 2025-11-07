class B{
	void m1() {
		System.out.println("This is m1");
		int square = m2(10);
		System.out.println("Square is " + square);
	}
	
	int m2(int n) {
		return n*n;
	}
}
public class p18_method_with_return_type {

	public static void main(String[] args) {
		B obj = new B();
		obj.m1();

	}

}
