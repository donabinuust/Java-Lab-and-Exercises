package day2_exercises;

import java.util.Arrays;

public class p9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {23,5,67,20,30,79};
		Arrays.sort(arr);
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+ " ");
		}
	}

}
