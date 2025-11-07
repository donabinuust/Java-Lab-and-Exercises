package day2;

public class p13_var_args {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addNumbers(2);
		addNumbers(2,3);
		addNumbers(1,2,3,4);
		

	}
	
	static void addNumbers(int a, int ...b) {
		int sum = a;
		for(int i = 0;i<b.length;i++) {
			sum+=b[i];
		}
		System.out.println("Sum is " + sum);
	}

}
