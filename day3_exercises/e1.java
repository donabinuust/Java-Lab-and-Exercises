package day3_exercises;

class BankAccount{
	int balance;
	void deposit(int amount) {
		balance+=amount;
	}
	void withdraw(int amount) {
		balance-=amount;
	}
	void display() {
		System.out.println("Balance is " + balance);
	}
}

class SavingsAccount extends BankAccount{
	void withdraw(int amount) {
		if(balance<100) {
			System.out.println("Balance less than 100, cannot withdraw");
		}
		else {
			super.withdraw(amount);
		}
	}
}

public class e1 {
	public static void main(String[] args) {
		SavingsAccount obj = new SavingsAccount();
		obj.deposit(1000);
		obj.display();
		obj.withdraw(500);
		obj.display();
		obj.withdraw(450);
		obj.display();
		obj.withdraw(20);
		obj.deposit(500);
		obj.display();
	}
}
