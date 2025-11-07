package Bank;

public class Customer {
	public int cust_id = 101;
	public static int balance = 1000;
	private int pin = 6803;
	public String cust_name = "Dona";

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}
}
