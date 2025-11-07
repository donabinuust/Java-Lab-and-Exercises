package day4;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class p6_checked_exception {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		FileReader file = new FileReader("C:\\java_practice\\DemoJava\\src\\day4\\dummy.txt");
		//this is a checked exception, so if we aren't using throws it will show an error

	}

}
