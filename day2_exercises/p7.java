package day2_exercises;

class Book{
	String title, author;
	int price;
	
	Book(){
		title = "Default title";
		author = "Default author";
		price = 0;
	}
	Book(String title, String author){
		this.title = title;
		this.author = author;
		price = 0;
	}
	Book(String title, String author, int price){
		this.title = title;
		this.author = author;
		this.price = price;
	}
	void printValues() {
		System.out.println("Title is " + title + " and author is " + author + " and price is " + price);
	}
}

public class p7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book obj1 = new Book();
		obj1.printValues();
		Book obj2 = new Book("Book1", "Author1");
		obj2.printValues();
		Book obj3 = new Book("Book2", "Author2", 2000);
		obj3.printValues();

	}

}
