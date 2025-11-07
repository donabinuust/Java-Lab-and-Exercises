package exercises;
import java.util.*;

public class e11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		String word = sc.next();
		word = word.toLowerCase();
		int count = 0;
		
		for(int i=0;i<word.length();i++) {
			if(word.charAt(i)=='a' || word.charAt(i)=='e' || word.charAt(i)=='i' || word.charAt(i)=='o' || word.charAt(i)=='u') {
				count++;
			}
		}
		System.out.println("vowel count: "+count);
		sc.close();
	}

}
