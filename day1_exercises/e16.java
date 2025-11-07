package exercises;

class stringUtility{
	int stringLength(String s) {
		return s.length();
	}
	int countVowels(String s) {
		s = s.toLowerCase();
		int count = 0;
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u') {
				count++;
			}
		}
		return count;
	}
}
public class e16 {

	public static void main(String[] args) {
		stringUtility obj = new stringUtility();
		int l = obj.stringLength("java");
		int c = obj.countVowels("apple");
		System.out.println("String length: " + l + " and vowel count: " + c);

	}

}
