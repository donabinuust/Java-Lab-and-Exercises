package day2_exercises;
import java.util.*;

public class p16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int flag = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name:");
		String name = sc.next();
		char arr[] = name.toCharArray();
		for(char ch: arr) {
			if(Character.isDigit(ch)) {
				flag=1;
				break;
			}
		}
		if(flag==1) {
			System.out.println("Contains numbers");
		}
		else {
			System.out.println("Doesn't contain numbers");
		}
		
	}

}
