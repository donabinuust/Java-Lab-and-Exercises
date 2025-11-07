import java.util.Scanner;
public class p7_scanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your username: ");
		String username = sc.next();
		System.out.println("Enter your age: ");
		int age = sc.nextInt();
		
		System.out.println("Username: " + username);
		System.out.println("Age: " + age);
	}

}
