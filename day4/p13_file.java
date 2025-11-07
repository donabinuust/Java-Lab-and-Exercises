package day4;

import java.io.File;
import java.io.IOException;

public class p13_file {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File myfile = new File("C:\\test.txt");
		boolean res = myfile.createNewFile();
		if(res==true) {
			System.out.println("New file created");
		}
		else {
			System.out.println("File already exists");
		}
		if(myfile.exists()) {
			System.out.println("File path:" + myfile.getAbsolutePath());
			System.out.println("File name:" + myfile.getName());
			System.out.println("Is the file readable:" + myfile.canRead());
			System.out.println("Is the file writable:" + myfile.canWrite());
		}

	}

}
