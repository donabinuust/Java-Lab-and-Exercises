package exercises;

class calc{
	int add(int a,int b) {
		return a+b;
	}
	int multiply(int a,int b) {
		return a*b;
	}
}

public class e15 {

	public static void main(String[] args) {
		calc obj = new calc();
		int sum = obj.add(5,5);
		int product = obj.multiply(5,5);
		System.out.println("Sum is " + sum + " and Product is " + product);

	}

}
