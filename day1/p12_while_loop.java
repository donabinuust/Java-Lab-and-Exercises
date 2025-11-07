import java.util.Scanner;

public class p12_while_loop {

	public static void main(String[] args) {
		int i=1,n,sum=0,avg;
		System.out.println("Enter 5 numbers:");
		Scanner sc = new Scanner(System.in);
		
		while(i<=5) {
			n=sc.nextInt();
			sum+=n;
			i++;
		}
		avg=sum/5;
		System.out.println("Sum is "+sum+" and average is "+avg);
	}

}
