package day2_exercises;
import java.util.*;

public class p15 {
	
	static int bin_search(int[] arr, int val) {
		int l=0,r=arr.length-1;
		while(l<=r) {
			int mid = (l+r)/2;
			if(arr[mid]==val) {
				return mid;
			}
			else if(arr[mid]<val) {
				l = mid + 1;
			}
			else {
				r = mid - 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5};
		Arrays.sort(arr);
		System.out.println("Enter the value to search:");
		Scanner sc = new Scanner(System.in);
		int val = sc.nextInt();
		int result = bin_search(arr,val);
		if(result==-1) {
			System.out.println("Element not found");
		}
		else {
			System.out.println("Element found at index " + result);
		}
		sc.close();
	}

}
