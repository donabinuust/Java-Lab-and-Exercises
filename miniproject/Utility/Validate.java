package Utility;

import Bank.Customer;

public class Validate extends Customer {

	public boolean validateWithdrawal(int amount){
		if(balance<amount) {
			return false;
		}
		else {
			return true;
		}
	}
	
	public boolean validatePin(int p) {
		if(p==getPin()) {
			return true;
		}
		else {
			return false;
		}
	}
}
