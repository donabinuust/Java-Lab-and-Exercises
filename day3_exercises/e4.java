package day3_exercises;

class employee{
	int empid = 01;
	String empname = "emp1", city = "city1";
	void display() {
		System.out.println("Employee id: " + empid);
		System.out.println("Employee name: " + empname);
		System.out.println("Employee city: " + city);
	}
}

class salary extends employee{
	double basic = 425000, da, hra, pf, gross, netpay;
	void calculateSalary() {
		da = 0.3*basic;
		hra = 0.2*basic;
		pf = 0.08*basic;
		gross = basic+da+hra+pf;
		netpay = gross - pf;		
	}
	void display() {
		super.display();
		System.out.println("Gross pay: " + gross);
		System.out.println("Net pay: " + netpay);
	}
}

public class e4 {
	public static void main(String[] args) {
		salary obj = new salary();
		obj.calculateSalary();
		obj.display();
	}
}
