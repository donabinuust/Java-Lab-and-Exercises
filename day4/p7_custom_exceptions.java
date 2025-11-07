package day4;

public class p7_custom_exceptions{

	public static void main(String[] args) throws myException{
		// TODO Auto-generated method stub
		int a = -30;
		try {
			if(a>0) {
				System.out.println("Greater than 0");
			}
			else {
				throw new myException("Negative number");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
