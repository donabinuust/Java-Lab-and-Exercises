package day3;

interface customer{
	int a = 10;
	static final int b = 10;
	public void deposit();
}

interface transaction{
	public void withdraw();
}

class bank implements customer, transaction{
	@Override
	public void withdraw() {
		
	}
	@Override
	public void deposit() {
		
	}
}

public class p11_interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
