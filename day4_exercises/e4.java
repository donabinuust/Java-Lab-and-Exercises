package day4_exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class e4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> books = new ArrayList<>();
		List<Integer> ids = new ArrayList<>();
		List<String> authors = new ArrayList<>();
		List<Integer> prices = new ArrayList<>();
		int ch;
		do {
			System.out.println("Enter your choice:\n1.Add a book\n2.View books\n3.Remove a book\n4.Verify if book exists or not\n5.Exit\n");
			ch = sc.nextInt();
			switch(ch) {
			case 1: {
				System.out.println("Enter the book id:");
				Integer id = sc.nextInt();
				if(ids.contains(id)) {
					System.out.println("Book already in library");
					break;
				}
				System.out.println("Enter the book name:");
				sc.nextLine();
				String book = sc.nextLine();
				System.out.println("Enter the author:");
				String author = sc.nextLine();
				System.out.println("Enter the price:");
				Integer price = sc.nextInt();
				ids.add(id);
				books.add(book);
				authors.add(author);
				prices.add(price);
				System.out.println("Book added successfully");
				break;
			}
			case 2: {
				System.out.println(books);
				break;
				
			}
			case 3: {
				System.out.println("Enter the book id of the book to be removed:");
				int rid = sc.nextInt();
				int index = ids.indexOf(rid);
				if(index==-1) {
					System.out.println("Book doesn't exist");
				}
				else {
					ids.remove(index);
					books.remove(index);
					authors.remove(index);
					prices.remove(index);
					System.out.println("Book removed successfully");
				}
				break;
			}
			case 4: {
				System.out.println("Enter the book id:");
				int rid = sc.nextInt();
				if(ids.contains(rid)) {
					System.out.println("Book id verified");
				}
				else {
					System.out.println("Book id not verified");
				}
				break;
				
			}
			case 5: {
				System.out.println("Exiting, bye");
				break;
			}
			}
		}while(ch!=5);
	}

}
