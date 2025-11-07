//Hashset
//Movie(movieId, title, genre, duration, language)
//Showtime(showId, movieId, date, time, screenNumber)
//Customer(customerId, name, email, phone)
//Ticket(ticketId, customerId, showId, numberOfSeats)

package movie_app;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
//Customer Management
//Add customer details
//View customer list
//Each customer has: customerId, name, email, phone
class Customer {
	String customerId, name, email, phone;
	Customer(String customerId, String name, String email, String phone){

		this.customerId = customerId;
		this.name = name;
		this.email = email;
		this.phone = phone;
	}
}
//Movie Management
//Add new movies
//View all available movies
//Each movie has: movieId, title, genre, duration, language
class Movie {
	String movieId, duration, title, genre, language;
	Movie(String movieId, String title, String genre, String duration, String language){
		this.movieId = movieId;
		this.title = title;
		this.genre = genre;
		this.duration = duration;
		this.language = language;
	}
}
//Showtime Management
//Add showtimes for movies
//View showtimes
//Each showtime has: showId, movieId, date, time, screenNumber
class Showtime{
	String showId, movieId, screenno, date, time;
	Showtime(String showId, String movieId, String date, String time, String screenno){
		this.showId = showId;
		this.movieId = movieId;
		this.date = date;
		this.time = time;
		this.screenno = screenno;
	}
}
//Ticket Booking
//Book tickets for a customer for a specific show
//View booked tickets
//Each ticket has: ticketId, customerId, showId, numberOfSeats
class Ticket {
	String ticketId, customerId, showId, numberOfSeats;
	Ticket(String ticketId, String customerId, String showId, String numberOfSeats){
		this.customerId = customerId;
		this.ticketId = ticketId;
		this.showId = showId;
		this.numberOfSeats = numberOfSeats;
	}
}

class BookingInfo{
	String movieName, showTime, numberOfSeats;
	BookingInfo(String movieName, String showTime, String numberOfSeats){
		this.movieName = movieName;
		this.showTime = showTime;
		this.numberOfSeats = numberOfSeats;
	}
}

//View all bookings made by a customer
//Show movie name, showtime, and number of seats 
public class history {
	Scanner sc = new Scanner(System.in);
	HashSet<Ticket> tickets = new HashSet<Ticket>();
	HashSet<Customer> customers = new HashSet<Customer>();
	HashSet<Movie> movies = new HashSet<Movie>();
	HashSet<Showtime> shows = new HashSet<Showtime>();
	List<BookingInfo> history = new ArrayList<BookingInfo>();
	
	Customer c1 = new Customer("1", "Alice", "alice@example.com", "9876543210");
	Customer c2 = new Customer("2", "Bob", "bob@example.com", "9123456780");
	Customer c3 = new Customer("3", "Charlie", "charlie@example.com", "9988776655");
	Movie m1 = new Movie("101", "Inception", "Sci-Fi", "148", "English");
	Movie m2 = new Movie("102", "3 Idiots", "Comedy", "171", "Hindi");
	Movie m3 = new Movie("103", "Parasite", "Thriller", "132", "Korean");
	Showtime s1 = new Showtime("201", "101", "2025-11-05", "18:00", "1"); // Inception
	Showtime s2 = new Showtime("202", "102", "2025-11-06", "15:00", "2"); // 3 Idiots
	Showtime s3 = new Showtime("203", "103", "2025-11-07", "20:00", "3"); // Parasite
	Ticket t1 = new Ticket("301", "1", "201", "2"); // Alice → Inception
	Ticket t2 = new Ticket("302", "2", "202", "3"); // Bob → 3 Idiots
	Ticket t3 = new Ticket("303", "1", "203", "1"); // Alice → Parasite
	Ticket t4 = new Ticket("304", "3", "202", "2"); // Charlie → 3 Idiots
	
	
	void viewBookingHistory(){
		customers.add(c1);
		customers.add(c2);
		customers.add(c3);
		movies.add(m1);
		movies.add(m2);
		movies.add(m3);
		shows.add(s1);
		shows.add(s2);
		shows.add(s3);
		tickets.add(t1);
		tickets.add(t2);
		tickets.add(t3);
		tickets.add(t4);
		
		System.out.println("Enter the customer id: ");
		String cust_id = sc.next();
		for(Ticket t: tickets) {
			if(cust_id.equalsIgnoreCase(t.customerId)) {
				String numberOfSeats = t.numberOfSeats;

				for(Showtime s: shows) {
					if(t.showId.equalsIgnoreCase(s.showId)) {
						String showtime = s.time;
						
						for(Movie m: movies) {
							if(s.movieId.equalsIgnoreCase(m.movieId)) {
								String moviename = m.title;
								history.add(new BookingInfo(moviename, showtime, numberOfSeats ));
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
}
