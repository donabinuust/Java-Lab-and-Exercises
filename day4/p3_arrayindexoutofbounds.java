package day4;

public class p3_arrayindexoutofbounds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[4];
		try {
			arr[10] = 10;
			System.out.println(arr[10]);
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("Trying to access non existent index");
		}
		System.out.println("Rest of the code");

	}

}
