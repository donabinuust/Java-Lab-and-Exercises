package exercises;
import java.util.Scanner;

public class e6_printing_name_email {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name: ");
		String name = sc.next();
		System.out.println("Enter your email: ");
		String email = sc.next();
		System.out.println("Enter your dob: ");
		String dob = sc.next();
		
		System.out.println("Hi "+name+" ,welcome to Java training. Your email is "+email+" and your dob is " +dob+".");
		
		sc.close();
	}

}
