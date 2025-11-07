package movie_app;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

//Booking History
//View all bookings made by a customer
//Show movie name, showtime, and number of seats 
//class BookingInfo{
//	String movieName, showTime, numberOfSeats;
//	BookingInfo(String movieName, String showTime, String numberOfSeats){
//		this.movieName = movieName;
//		this.showTime = showTime;
//		this.numberOfSeats = numberOfSeats;
//	}
//}

//View all bookings made by a customer
//Show movie name, showtime, and number of seats 
public class BookingHistory {
	Scanner sc = new Scanner(System.in);
	
	HashSet<Ticket> tickets = TicketManagement.tickets;
	HashSet<Customer> customers = CustomerManagement.customers;
	HashSet<Movie> movies = MovieManagement.movies;
	HashSet<Showtime> shows = ShowManagement.shows;
	List<BookingInfo> history = new ArrayList<BookingInfo>();
	
	void viewBookingHistory(){
		System.out.println("Enter the customer id: ");
		String custId = sc.next();
		
		boolean customerExists = false;
	    for (Customer c : customers) {
	        if (custId.equalsIgnoreCase(c.customerId)) {
	            customerExists = true;
	            break;
	        }
	    }

	    if(customerExists) {
	    	for(Ticket t: tickets) {
				if(custId.equalsIgnoreCase(t.customerId)) {
					String numberOfSeats = t.numberOfSeats;

					for(Showtime s: shows) {
						if(t.showId.equalsIgnoreCase(s.showId)) {
							String showTime = s.time;
							
							for(Movie m: movies) {
								if(s.movieId.equalsIgnoreCase(m.movieId)) {
									String movieName = m.title;
									history.add(new BookingInfo(movieName, showTime, numberOfSeats ));
								}
							}
						}
					}				
				}
			}
			if(history.isEmpty()) {
				System.out.println("No bookings to show");
			}
			else {
				for(BookingInfo b: history) {
					System.out.println("Movie name: " + b.movieName + ", Show time: " + b.showTime + ", Number of Seats: " + b.numberOfSeats);
				}
				history.clear();
			}
	    }
	    else {
	    	System.out.println("Customer doesn't exist");
	    }
		
		
	}
}
