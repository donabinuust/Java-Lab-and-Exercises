package day4_exercises;

import java.util.Scanner;

public class e3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter password:");
			String pass = sc.next();
			if(pass.length()<8) {
				throw new Exception("Length less than 8");
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
