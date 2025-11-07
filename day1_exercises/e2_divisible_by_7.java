//Write a java program that accepts a number from user and checks if it is divisible by 7 or not
package exercises;
import java.util.Scanner;

public class e2_divisible_by_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		
		System.out.println("Divisible by 7 : " + (num%7==0));
		
		sc.close();
	}

}
