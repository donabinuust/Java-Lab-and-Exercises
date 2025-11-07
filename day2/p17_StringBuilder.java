package day2;

public class p17_StringBuilder {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder("hi");
		System.out.println("Initial value:" + sb);
		System.out.println("Adding new string to the end:" + sb.append("user"));
		System.out.println("Inserting new string at any index:" + sb.insert(2, "new"));
		System.out.println("Reversing string:" + sb.reverse());

	}
}
