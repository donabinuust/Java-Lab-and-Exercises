package movie_app;

import java.util.Scanner;

public class UI {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BookingHistory bh = new BookingHistory();
		int ch;
		do {
			System.out.println("\nEnter your choice:\n1.Add customer\n2.View customers\n3.Remove customers\n4.Add movies\n5.View movies\n6.Remove movies\n7.View show time\n8.Book tickets\n9.View tickets\n10.View booking history\n11.Exit");
			ch = sc.nextInt();
			switch(ch) {
			case 1:{
				//addCustomer();
				break;
			}
			case 2:{
				//viewCustomers();
				break;
			}
			case 3:{
                //removeCustomer();
				break;
			}
			case 4:{
				//addMovie();
				break;
			}
			case 5:{
				//viewMovies();
				break;
			}
			case 6:{
				//removeMovies();
				break;
			}
			case 7:{
				//viewShow();
				break;
			}
			case 8:{
				//bookTickets();
				break;
			}
			case 9: {
				//showTickets();
				break;
			}
			case 10: {
				bh.viewBookingHistory();
				break;
			}
			case 11:{
				System.out.println("Exiting, Bye");
				System.exit(0);
				break;
			}
			default:{
				System.out.println("Invalid input");
				break;
			}
			}
		}while(ch!=11);
		sc.close();
	}

}
