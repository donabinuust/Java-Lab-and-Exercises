
public class p10_nested_if {

	public static void main(String[] args) {
		int mark = 78;
		
		if(mark>75) {
			System.out.println("Distinction");
		}
		else if((mark>59) && (mark<75)) {
			System.out.println("First class");
		}
		else if((mark>49) && (mark<59)) {
			System.out.println("Second class");
		}
		else {
			System.out.println("Fail");
		}
	}

}
