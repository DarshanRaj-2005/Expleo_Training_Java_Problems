package Java_Basics;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.text.SimpleDateFormat;
import java.util.ArrayList;


//Using interface to use multiple inheritance in java

interface SearchbyGenre {
	public void searchbyGenre(String genre);
}

interface SearchbyTitle {
	public void searchbyTitle(String title);
}

class Movie {
	
	private String title;
	private String description;
	private int rating;
	private String language;
	private String date;
	private String country;
	private String genre;
	
	Movie(String title,String type,int runTime,String language,String date, String country, String genre) {
		this.title = title;
		this.description = type;
		this.rating = runTime;
		this.language = language;
		this.date = date;
		this.country = country;
		this.genre = genre;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getGenre() {
		return genre;
	}
	
	public String getMovieDetial() {
		return "Title: "+ title + " | Description: "+ description +" | Rating:"+ rating + " | Language: "+
	    language + " | Date: " + date + "| Country: " + country + " | Genre: " + genre;
	}
}
class Catalog implements SearchbyGenre,SearchbyTitle{
    List<Movie> MovieList = new ArrayList<Movie>();
	
	@Override
	public void searchbyTitle(String title) {
		for(Movie movie : MovieList) {
			if(movie.getTitle().equals(title)) {
				System.out.println(movie.getMovieDetial());
			}
		}
	}
	
	@Override
	public void searchbyGenre(String genre) {
		for(Movie movie : MovieList) {
			if(movie.getGenre().equals(genre)) {
				System.out.println(movie.getMovieDetial());
			}
		}
	}
}

public class Interface_using_Multiple_Inheritance {

	public static void main(String[] args) {
		
		Calendar ca = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date date = ca.getTime();
		String dateFormat = sdf.format(date);
		
		Catalog c = new Catalog();
		Movie m1 = new Movie("AAA","Drama",3,"English",dateFormat,"France","Action");
		c.MovieList.add(m1);
		
		Movie m2 = new Movie("BBB","Drama",3,"Tamil",dateFormat,"India","Action-Thriller");
		c.MovieList.add(m2);
		
		System.out.println("Search by Title");
		System.out.println("-------------------------");
		c.searchbyTitle("BBB");
		System.out.println();
		System.out.println("Search by Genre");
		System.out.println("-------------------------");
		c.searchbyGenre("Action");
	}
}
