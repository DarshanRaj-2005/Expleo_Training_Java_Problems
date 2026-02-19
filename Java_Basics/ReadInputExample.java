package Java_Basics;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class ReadInputExample {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Movie Id: ");
		int movieId = sc.nextInt();
		
		sc.nextLine();
		System.out.println("Enter the Movie Name: ");
		String movieName = sc.nextLine();
		
		System.out.println("Enter the Movie Description: ");
		String movieDescription = sc.nextLine();
		
		System.out.println("Enter the Movie Language: ");
		String movieLanguage = sc.next();
		
		System.out.println("Enter the Movie Genre: ");
		String movieGenre = sc.next();
		
		//Using SimpleDateFormat package for using the standard date format
		System.out.println("Enter the Movie Release Date(dd/mm/yyyy): ");
		String date = sc.next();
		
		//"MM" should be used because "mm" considered as minutes
		SimpleDateFormat movieReleaseDate = new SimpleDateFormat("dd/MM/yyyy");
		Date movieDate = movieReleaseDate.parse(date);
		
		
		System.out.println("Enter the Seat Cost: ");
		float seatCost = sc.nextFloat();
		
		System.out.println("\nEntered Movie Detials: ");
		System.out.println("-------------------------");
		System.out.println("Movie Id: "+movieId);
		System.out.println("Movie Name: "+movieName);
		System.out.println("Movie Description: "+movieDescription);
		System.out.println("Movie Language: "+movieLanguage);
		System.out.println("Movie Genre: "+movieGenre);
		System.out.println("Movie Release Date: "+movieDate);
		System.out.println("Seat Cost: "+seatCost);
		
		sc.close();
	}
}
