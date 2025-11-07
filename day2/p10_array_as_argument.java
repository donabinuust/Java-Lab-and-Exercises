package day2;

public class p10_array_as_argument {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10,12,22,45,80};
		System.out.println(greatest(arr));
	}
	
	static int greatest(int arr[]) {
		int total = arr.length;
		int max = arr[0];
		for(int i=1;i<total;i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		return max;
	}

}
