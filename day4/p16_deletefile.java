package day4;

import java.io.File;

public class p16_deletefile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("C:\\test.txt");
		if(f.delete()) {
			System.out.println("File deleted successfully");
		}
		else {
			System.out.println("File doesn't exist");
		}
	}

}
