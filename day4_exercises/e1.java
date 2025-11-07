package day4_exercises;

import java.util.Scanner;

public class e1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 5 numbers:");
		try {
			for(int i = 0; i<5; i++) {
				int num = sc.nextInt();
				if(num<0) {
					throw new Exception("Negative number");
				}
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
