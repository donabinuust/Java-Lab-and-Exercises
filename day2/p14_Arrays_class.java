package day2;
import java.util.Arrays;

public class p14_Arrays_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,5,3,4,1};
		System.out.println("Before sorting:");
		for(int num: arr) {
			System.out.print(num+" ");
		}
		Arrays.sort(arr);
		System.out.println("\nAfter sorting:");
		for(int num: arr) {
			System.out.print(num+" ");
		}
	}

}
