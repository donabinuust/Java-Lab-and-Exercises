package day4;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class p15_filereader {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		FileReader fr = new FileReader("C:\\test.txt");
		Scanner sc = new Scanner(fr);
		while(sc.hasNext()) {
			String content = sc.nextLine();
			System.out.println(content);
		}
		sc.close();
	}

}
