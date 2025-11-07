package day4;

import java.io.FileWriter;
import java.io.IOException;

public class p14_filewriter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter fw = new FileWriter("C:\\test.txt");
		fw.write("First line\n");
		fw.write("Second line\n");
		fw.write("Third line\n");
		fw.close();
	}

}
