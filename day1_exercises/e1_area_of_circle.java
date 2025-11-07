//Write a java program that accepts radius from the user and displays the area of the circle
package exercises;
import java.util.Scanner;

public class e1_area_of_circle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final double pi = 3.14;
		
		System.out.println("Enter the radius: ");
		int radius = sc.nextInt();
		
		System.out.println("Area of circle is " + (pi*radius*radius));
		
		sc.close();
	}

}
