//Write a java program that inputs basic salary from the user and calculate the net salary.
package exercises;
import java.util.Scanner;

public class e4_netsalary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your basic salary: ");
		double salary = sc.nextDouble();
		
		double dearness = 0.3 * salary;
		double rent = 0.18 * salary;
		double citycomp = 0.2 * salary;
		double pf = 0.08 * salary;
		
		double grosspay = salary + dearness + rent + citycomp + pf;
		double netpay = grosspay - pf;
		System.out.println("Dearness allowance: " + dearness);
		System.out.println("House rent allowance: " + rent);
		System.out.println("City compensation: " + citycomp);
		System.out.println("Provident fund: " + pf);
		System.out.println("Gross pay: " + grosspay);
		System.out.println("Net pay: " + netpay);
	}

}
