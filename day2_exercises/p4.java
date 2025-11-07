package day2_exercises;

class display_overload{
	void display() {
		System.out.println("No arguments to display");
	}
	void display(int a) {
		System.out.println("Argument is " + a);
	}
	void display(String a) {
		System.out.println("Argument is " + a);
	}
	void display(int a, String b) {
		System.out.println("Arguments are " + a + " and " + b);
	}
}

public class p4 {

	public static void main(String[] args) {
		display_overload obj = new display_overload();
		obj.display();
		obj.display(3);
		obj.display("hello");
		obj.display(2, "hii");

	}

}
