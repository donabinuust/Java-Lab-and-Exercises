import java.util.Scanner;
public class p13_do_while {

	public static void main(String[] args) {
		int ch;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Enter your name: ");
			String name = sc.next();
			System.out.println("Hello " + name);
			System.out.println("Do you want to continue(0/1): ");
			ch = sc.nextInt();
		}while(ch==1);
		
		sc.close();

	}

}
