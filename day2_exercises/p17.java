package day2_exercises;

public class p17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Your order number is 212";
//		String order_no = str.substring(21);
		String arr[] = str.split(" ");
		String order_no = arr[4];
		System.out.println("Order no: " + order_no);

	}

}
