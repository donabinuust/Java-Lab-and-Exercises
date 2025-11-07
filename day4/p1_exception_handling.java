package day4;

import java.util.Scanner;

public class p1_exception_handling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter the first number:");
			a = sc.nextInt();
			System.out.println("Enter the second number:");
			b = sc.nextInt();
			c = a+b;
			System.out.println("Result is " + c);
		} catch (Exception e) {
			System.out.println("Error in input");
		}
		System.out.println("Rest of the code");
	}

}
