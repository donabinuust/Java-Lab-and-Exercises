package day3;

class c1{
	int a = 10;
}

class c2 extends c1{
	int b = 20;
}

class c3 extends c2{
	int c = a + b;
	void display() {
		System.out.println(c);
	}
}
public class p2_multilevel_inheritance {
	public static void main(String[] args) {
		c3 obj = new c3();
		obj.display();
	}
}
