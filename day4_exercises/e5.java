//Develop an inventory management app for the user to perform the following:
//add items to store
//view items in the store
//remove items from the store
//check the min and max quantity of each product(min=5 to max=100)
//display the menu:
//	1.add items to store
//	2.view items in store
//	3.issue the items
//	4. remove items
//	5. exit

package day4_exercises;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

class Item{
	String name;
	int id, quantity;
	
	Item(int id, String name, int quantity){
		this.id = id;
		this.name = name;
		this.quantity = quantity;
	}
}

public class e5 {
	
	static Scanner sc = new Scanner(System.in);
	static HashMap<Integer,Item> inventory = new HashMap<>();
	
	static void addItem() {
		System.out.println("Enter the item id:");
		int id = sc.nextInt();
		if(inventory.containsKey(id)) {
			System.out.println("Item already in inventory");
			System.out.println("Enter quantity to add: ");
			int quantity = sc.nextInt();
			if(inventory.get(id).quantity>=100 || (inventory.get(id).quantity+quantity)>100) {
				System.out.println("Maximum items in inventory, cannot add more");
			}
			else {
				inventory.get(id).quantity+=quantity;
				System.out.println("Item added successfully");
			}
		}
		else {
			System.out.println("Enter the item name:");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Enter quantity to add: ");
			int quantity = sc.nextInt();
			if(quantity>=100) {
				System.out.println("Maximum quantity is 100, cannot add");
			}
			else {
				inventory.put(id, new Item(id, name, quantity));
				System.out.println("Item added successfully");
			}
		}
	}

	static void viewItems() {
		if(inventory.isEmpty()) {
			System.out.println("No items to show");
		}
		else {
			for(Item i: inventory.values()) {
				System.out.print(i.name + " - " + i.quantity + " , ");
			}
		}
	}
	
	static void removeItem() {
		System.out.println("Enter the item id:");
		int id = sc.nextInt();
		if(inventory.containsKey(id)) {
			inventory.remove(id);
			System.out.println("Item removed successfully");
		}
		else {
			System.out.println("Item not in inventory");
		}
	}
	
	static void issueItems() {
		System.out.println("Enter the item id:");
		int id = sc.nextInt();
		if(inventory.containsKey(id)) {
			System.out.println("Enter the quantity to be issued:");
			int quantity = sc.nextInt();
			if(inventory.get(id).quantity<=5 || (inventory.get(id).quantity-quantity)<5) {
				System.out.println("Not enough items in inventory to issue");
			}
			else {
				inventory.get(id).quantity-=quantity;
				System.out.println("Item issued successfully");
			}
		}
		else {
			System.out.println("Item not in inventory");
		}
	}
	
	public static void main(String[] args){
		int ch;
		do {
			System.out.println("\nEnter your choice:\n1.Add an item\n2.View items\n3.Issue items\n4.Remove an item\n5.Exit\n");
			ch = sc.nextInt();
			switch(ch) {
			case 1:{
				addItem();
				break;
			}
			case 2:{
				viewItems();
				break;
			}
			case 3:{
				issueItems();
				break;
			}
			case 4:{
				removeItem();
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
