package User_Interface;

import java.util.Scanner;

import Bank.Customer;
import Bank.Transaction;

public class Main_menu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Customer c = new Customer();
		Transaction tr = new Transaction();
		
		int ch;
		do {
			System.out.println("Welcome to the bank. Select a service:\n1.Deposit\n2.Withdraw\n3.View customer details\n4.Exit\n");
			ch = sc.nextInt();
			if(ch==1) {
				tr.deposit();				
			}
			else if(ch==2) {
				tr.withdraw();
			}
			else if(ch==3) {
				System.out.println("Customer id: " + c.cust_id);
				System.out.println("Customer name: " + c.cust_name);
				System.out.println("Balance: " + c.balance);
			}
			else if(ch==4) {
				System.out.println("Exiting, Bye!");
				break;
			}
			else {
				System.out.println("Invalid choice");
			}
		}while(ch!=4);

	}

}
