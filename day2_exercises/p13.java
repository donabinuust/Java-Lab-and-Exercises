package day2_exercises;

import java.util.Scanner;

public class p13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total;
		System.out.println("Enter the number of values:");
		Scanner sc = new Scanner(System.in);
		total = sc.nextInt();
		int arr[] = new int[total];
		for(int i=0;i<total;i++) {
			System.out.println("Enter the value:");
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<total;i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
