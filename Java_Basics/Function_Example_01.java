package Java_Basics;
import java.util.Scanner;

public class Function_Example_01 {
	
	static void getDetials(String name, String description, String duration, 
			String language, String releaseDate, String country, String genre) {
		
		System.out.println("Name of the Movie: "+name);
		System.out.println("Description of the Movie: "+description);
		System.out.println("Duration of the Movie: "+duration);
		System.out.println("Language of the Movie: "+language);
		System.out.println("Release Date of the Movie: "+releaseDate);
		System.out.println("Country of the Movie: "+country);
		System.out.println("Genre of the Movie: "+genre);
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter Movie Name: ");
		String name =  sc.nextLine();
		System.out.println("Enter Movie Description: ");
		String description =  sc.nextLine();
		System.out.println("Enter Movie Duration: ");
		String duration =  sc.nextLine();
		System.out.println("Enter Movie Language: ");
		String language =  sc.nextLine();
		System.out.println("Enter Movie Release Date: ");
		String releaseDate =  sc.nextLine();
		System.out.println("Enter Movie Country: ");
		String country =  sc.nextLine();
		System.out.println("Enter Movie Genre: ");
		String genre =  sc.nextLine();
		
		getDetials(name,description,duration,language,releaseDate,country,genre);
		sc.close();
	}

}
