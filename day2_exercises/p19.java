package day2_exercises;
import java.util.*;

public class p19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter password: ");
		String password = sc.nextLine();
		if(password.length()<8) {
			System.out.println("Pasword must contain 8 chars");
		}
		else {
			int flag = 0;
			for(int i=0;i<password.length();i++) {
				char ch = password.charAt(i);
				if(Character.isDigit(ch)) {
					flag = 1;
					break;
				}
			}
			if(flag == 0) {
				System.out.println("Password must contain a digit");
			}
			else {
				System.out.println("Strong password");
			}
		}
	}

}
