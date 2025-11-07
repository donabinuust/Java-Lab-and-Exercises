package day2;

class method_overloading{
	int add(int a, int b) {
		return (a+b);
	}
	String add(String a, String b) {
		return (a+b);
	}
}

public class p2_method_overloading {

	public static void main(String[] args) {
		method_overloading obj = new method_overloading();
		System.out.println(obj.add(2, 4));
		System.out.println(obj.add("hell", "oo"));
	}

}
