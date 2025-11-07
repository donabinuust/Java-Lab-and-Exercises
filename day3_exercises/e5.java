package day3_exercises;

abstract class Employee{
	abstract void calculateSalary();
	abstract void displayInfo();
}

class Manager extends Employee{

	@Override
	void calculateSalary() {
		// TODO Auto-generated method stub
		System.out.println("Manager's salary");
	}

	@Override
	void displayInfo() {
		// TODO Auto-generated method stub
		System.out.println("Manager's Info");
	}
}

class Programmer extends Employee{

	@Override
	void calculateSalary() {
		// TODO Auto-generated method stub
		System.out.println("Programmer's salary");
	}

	@Override
	void displayInfo() {
		// TODO Auto-generated method stub
		System.out.println("Programmer's info");
	}
}

public class e5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager ob = new Manager();
		Programmer pobj = new Programmer();
		ob.calculateSalary();
		ob.displayInfo();
		pobj.calculateSalary();
		pobj.displayInfo();
	}

}
