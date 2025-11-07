package exercises;
import java.util.*;

public class e7 {

	public static void main(String[] args) {
		int choice,sum=0,avg,count=0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Enter a number: ");
			int num = sc.nextInt();
			sum+=num;
			count++;
			System.out.println("Do you want to input next number? (No: Input -999, Yes: Press anything else)");
			choice = sc.nextInt();
		}while(choice!=-999);
		avg = sum/count;
		System.out.println("Sum is " + sum);
		System.out.println("Average is " + avg);
		sc.close();
	}

}
