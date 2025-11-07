package day3;

class privateAccess{
	private int a = 10;
	int b = 5;
	protected int c = 20;
	public int d = 30;
}

public class p9_visibility_control {
	public static void main(String[] args) {
		privateAccess obj = new privateAccess();
		System.out.println(obj.b); //b is default:can be accessed from anywhere in the same package
		//System.out.println(obj.a); //a is private:can be accessed only within the same class, so won't work
		System.out.println(obj.c); //c is protected:can be accessed within the same package, and outside the packgae through inheritance
		System.out.println(obj.d); //d is public:can be accessed from anywhere
	}
}
