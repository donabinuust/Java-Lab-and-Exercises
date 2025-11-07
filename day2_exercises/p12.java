package day2_exercises;

import java.util.Scanner;

public class p12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		for(int i=0;i<5;i++) {
			System.out.println("Enter the value:");
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<5;i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
