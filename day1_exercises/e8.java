package exercises;
import java.util.*;

public class e8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		int min=num, max=num;
		for(int i=0;i<4;i++) {
			System.out.println("Enter next number: ");
			num = sc.nextInt();
			if(num>max) {
				max=num;
			}
			if(num<min) {
				min=num;
			}
		}
		System.out.println("Smallest number is " + min);
		System.out.println("Largest number is " + max);

	}

}
