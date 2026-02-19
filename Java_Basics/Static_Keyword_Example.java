package Java_Basics;

class TheatreScreen {
	private static int totalSeats = 20;
	
	TheatreScreen() {
		System.out.println("No of Seats Available: "+totalSeats);
	}
	
	public void getAvailableSeats() {
		System.out.println("No of Seats Available: "+totalSeats);
	}
	
	public void bookTickets(int noOfTickets) {
		System.out.println("No of Seats Booked: "+noOfTickets);
		if (noOfTickets < 20 && totalSeats > 0) {
			totalSeats = totalSeats - noOfTickets;
		}
		else {
			System.out.println("Seats Not Available");
		}
		
	}
}
public class Static_Keyword_Example {

	public static void main(String[] args) {
		
		TheatreScreen ts1 = new TheatreScreen(),ts2 = new TheatreScreen();
		ts1.bookTickets(5);
		ts1.getAvailableSeats();
	}

}
