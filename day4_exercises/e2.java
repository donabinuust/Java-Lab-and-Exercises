package day4_exercises;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class e2 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		try {
			FileReader f = new FileReader("C:\\\\java_practic\\\\DemoJava\\\\src\\\\day4\\\\dummy.txt");
			System.out.println("File read successfully");
		} catch (Exception e) {
			System.out.println("File doesn't exist");
		}

	}

}
