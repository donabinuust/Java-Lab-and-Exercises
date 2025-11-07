package day2;

public class p11_returning_an_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10,200,300,400,500};
		arr = increment_by_hundred(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}

	}
	
	static int[] increment_by_hundred(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			arr[i]+=100;
		}
		return arr;
	}

}
