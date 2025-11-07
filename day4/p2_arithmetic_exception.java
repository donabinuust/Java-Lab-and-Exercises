package day4;

public class p2_arithmetic_exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10, b = 5, c = 5;
		try {
			int d = (a/(b-c));
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("Division by zero not allowed");
		}
		System.out.println("Rest of the code");

	}

}
