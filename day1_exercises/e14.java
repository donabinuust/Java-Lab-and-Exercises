package exercises;
import java.util.*;

public class e14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int flag=0;
		System.out.println("Enter a string: ");
		String word = sc.next();
		int i=0,j=word.length()-1;
		while(i<j) {
			if(word.charAt(i)!=word.charAt(j)) {
				flag=1;
				break;
			}
			i++;
			j--;
		}
		if(flag==1) {
			System.out.println("Not palindrome");
		}
		else {
			System.out.println("Palindrome");
		}
		sc.close();
	}

}
