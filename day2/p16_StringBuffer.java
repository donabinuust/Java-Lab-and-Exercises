package day2;

public class p16_StringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("hi");
		System.out.println("Initial value:" + sb);
		System.out.println("Adding new string to the end:" + sb.append("user"));
		System.out.println("Inserting new string at any index:" + sb.insert(2, "new"));
		System.out.println("Replacing string:" + sb.replace(2, 5, "oolalala"));

	}

}
