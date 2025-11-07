//Write a java program that accepts 5 numbers from the user and displays the sum and average.
package exercises;
import java.util.Scanner;

public class e3_sum_average {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 5 numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		System.out.println("Sum: " + (a+b+c+d+e));
		System.out.println("Average: " + ((a+b+c+d+e)/5));

		sc.close();
	}

}
