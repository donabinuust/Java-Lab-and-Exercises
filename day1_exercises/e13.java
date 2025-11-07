package exercises;

import java.util.Scanner;

public class e13 {
	public static void main(String[] args) {
		int num=0,even_count=0,odd_count=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter -999 to stop");
		while(num!=-999) {
			System.out.println("Enter a number: ");
			num = sc.nextInt();
			if(num%2==0) {
				even_count++;
			}
			else {
				odd_count++;
			}
		};
		System.out.println("No of odd numbers: " + (odd_count-1));
		System.out.println("No of even numbers: " + even_count);
		sc.close();
	}
}
