package exercises;
import java.util.Scanner;

public class e10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		
		int res = checkPositive(num);
		
		if(res==1) {
			System.out.println("Positive");
		}
		else {
			System.out.println("Not positive");
		}

		sc.close();
	}
	
	static int checkPositive(int num) {
		if(num>0) {
			return 1;
		}
		else {
			return 0;
		}
	}

}
