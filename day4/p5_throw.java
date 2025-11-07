package day4;

import java.util.Scanner;

public class p5_throw {
	
	static void validate(int age) {
		if(age<18) {
			throw new ArithmeticException("Invalid age");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age of the participant:");
		age = sc.nextInt();
		try {
			validate(age);
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("Rest of the code");
	}

}
