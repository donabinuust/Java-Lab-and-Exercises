package day4;

public class p4_multiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[4];
		int a = 5, b = 5, c = 5;
		try {
			int d = (a/(b-c));
			arr[10] = 5; //will be skipped when the first line shows error
		} catch (ArithmeticException e) {
			System.out.println("Division by 0");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Trying to access non existent index");
		}
		finally {
			System.out.println("finally code");
		}
		System.out.println("rest of the code");

	}

}
