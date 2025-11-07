class A{
	void m1() {
		System.out.println("This is m1");
		m2(10);
	}
	
	void m2(int n) {
		System.out.println("Result is " + (n+10));
	}
}
public class p17_method_with_parameter {

	public static void main(String[] args) {
		A obj = new A();
		obj.m1();

	}

}
