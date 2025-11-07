package day3;

class testing{
	void display() {
		System.out.println("base class method");
	}
}

class sampletesting extends testing{
	void display() {
		super.display();
		System.out.println("sub class method");
	}
}

public class p5_super_method {
	public static void main(String[] args) {
		sampletesting obj = new sampletesting();
		obj.display();
	}
}
