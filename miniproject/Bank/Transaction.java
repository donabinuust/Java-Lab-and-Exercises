package Bank;

import Utility.Validate;
import java.util.Scanner;

public class Transaction extends Customer{
	Scanner sc = new Scanner(System.in);
	Validate val = new Validate();
	
	public void deposit() {
		System.out.println("Enter your pin:");
		int pin = sc.nextInt();
		if(val.validatePin(pin)) {
			System.out.println("Enter amount to be deposited:");
			int dep = sc.nextInt();
			balance+=dep;
		}
		else {
			System.out.println("Incorrect pin");
		}
	}
	
	public void withdraw() {
		System.out.println("Enter your pin:");
		int pin = sc.nextInt();
		if(val.validatePin(pin)) {
			System.out.println("Enter amount to withdraw:");
			int with = sc.nextInt();
			if(val.validateWithdrawal(with)) {
				balance-=with;
			}
			else {
				System.out.println("Insufficient balance");
			}
		}
		else {
			System.out.println("Incorrect pin");
		}
	}
}
