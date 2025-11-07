package day3;

class staticdemo{
	int x = 10;
	static int y = 10; //static var = class var, retains its value
	staticdemo(){
		x++; //Initialized to 10 every time an obj is initialised
		y++; //retains its updated value because it is static
		System.out.println("x=" + x + " and y=" + y);
	}
}

public class p7_static_keyword {
	public static void main(String[] args) {
		new staticdemo();
		new staticdemo();
		new staticdemo();
		new staticdemo();
	}
}
