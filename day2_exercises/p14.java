package day2_exercises;

public class p14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,4,5,6};
		int neu[] = new int[5];
		for(int i=0;i<5;i++) {
			neu[i]=arr[i];
		}
		for(int num: arr) {
			System.out.print(num + " ");
		}
		System.out.println();
		for(int num: neu) {
			System.out.print(num + " ");
		}

	}

}
