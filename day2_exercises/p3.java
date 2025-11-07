package day2_exercises;

class overload{
	void compare(int a, int b) {
		if(a==b) {
			System.out.println("Same");
		}
		else {
			System.out.println("Not same");
		}
	}
	void compare(String a, String b) {
		if(a.equals(b)) {
			System.out.println("Same");
		}
		else {
			System.out.println("Not same");
		}
	}
}
public class p3 {

	public static void main(String[] args) {
		overload obj = new overload();
		obj.compare(1, 2);
		obj.compare("hello", "hello");

	}

}
