package exercises;
import java.util.*;

public class e12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double charge;
		System.out.println("Enter old meter reading: ");
		int old = sc.nextInt();
		System.out.println("Enter new meter reading: ");
		int neu = sc.nextInt();
		int units=neu-old;
		if(units>=1 && units<=100) {
			charge = 0 * units;
		}
		else if(units>=101 && units<=200) {
			charge = 1 * units;
		}
		else if(units>=201 && units<=300) {
			charge = 2 * units;
		}
		else if(units>=301 && units<=400) {
			charge = 3 * units;
		}
		else {
			charge = (4 * units) + (0.1*4*units);
		}
		System.out.println("Electricity charge: " + charge);
		
		sc.close();
	}

}
