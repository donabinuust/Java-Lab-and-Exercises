package day4_exercises;

import java.util.HashMap;
import java.util.Scanner;

class Book{
	int book_id, price;
	String name, author;
	
	Book(int book_id, String name, String author, int price){
		this.book_id = book_id;
		this.name = name;
		this.author = author;
		this.price = price;
	}
}

public class e4_class {
	static Scanner sc = new Scanner(System.in);
	static HashMap<Integer,Book> library = new HashMap<>();
	
	static void addBook() {
		System.out.println("Enter the book id:");
		int book_id = sc.nextInt();
		if(library.containsKey(book_id)) {
			System.out.println("Book already in library");
		}
		System.out.println("Enter the book name:");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.println("Enter the author:");
		String author = sc.nextLine();
		System.out.println("Enter the price:");
		Integer price = sc.nextInt();
		library.put(book_id, new Book(book_id, name, author, price));
		System.out.println("Book added successfully");
	}
	
	static void removeBook() {
		System.out.println("Enter the book id:");
		int book_id = sc.nextInt();
		library.remove(book_id);
		System.out.println("Book removed successfully");
	}
	
	static void viewBooks() {
		for(Book b: library.values()) {
			System.out.print(b.name + " ");
		}
	}
	
	static void verifyBook() {
		System.out.println("Enter the book id:");
		int book_id = sc.nextInt();
		if(library.containsKey(book_id)) {
			System.out.println("Book verified successfully");
		}
		else {
			System.out.println("Book doesn't exist");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ch;
		do {
			System.out.println("\nEnter your choice:\n1.Add a book\n2.View books\n3.Remove a book\n4.Verify a book\n5.Exit\n");
			ch = sc.nextInt();
			switch(ch) {
			case 1:{
				addBook();
				break;
			}
			case 2:{
				viewBooks();
				break;
			}
			case 3:{
				removeBook();
				break;
			}
			case 4:{
				verifyBook();
				break;
			}
			case 5:{
				System.out.println("Exiting, Bye");
				System.exit(0);
				break;
			}
			default:{
				System.out.println("Invalid input");
				break;
			}
			}
		}while(ch!=5);

	}

}
