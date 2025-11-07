package day3;

class baseclass{
	int x = 10;
}

class subclass extends baseclass{
	int x = 100;
	void display() {
		System.out.println("Base class:" + super.x);
		System.out.println("Sub class:" + x);
	}
}
public class p4_super {
	public static void main(String[] args) {
		subclass obj = new subclass();
		obj.display();
	}
}
