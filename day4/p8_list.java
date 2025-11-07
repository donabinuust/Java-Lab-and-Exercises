package day4;

import java.util.ArrayList;
import java.util.List;

public class p8_list {

	public static void main(String[] args) {
		List<String> arraylist = new ArrayList<>();
		arraylist.add("item");
		arraylist.add("item2");
		arraylist.add("item3");
		System.out.println(arraylist);
		arraylist.remove("item3");
		System.out.println(arraylist);
		System.out.println(arraylist.contains("item4"));
		System.out.println("Size of arraylist is " + arraylist.size());
	}

}
