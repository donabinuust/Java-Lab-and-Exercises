package day3;

abstract class employee{
	int empid, age;
	String empname;
	abstract void getPassportNumber();
}

class newemployee extends employee{
	@Override
	void getPassportNumber() {
		System.out.println("Getting passport number");
	}
}

public class p10_abstract_class {

	public static void main(String[] args) {
		newemployee obj = new newemployee();
		obj.getPassportNumber();
		

	}

}
