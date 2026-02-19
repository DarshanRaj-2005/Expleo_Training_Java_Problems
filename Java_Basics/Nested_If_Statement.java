package Java_Basics;
import java.util.Scanner;

public class Nested_If_Statement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String username = "Darshan";
		String password = "Darshan@12";
		
		System.out.println("Enter the Username");
		String userName = sc.nextLine();
		System.out.println("Enter the Password");
		String passWord = sc.nextLine();
		
		System.out.println("Enter the seatNumber :(Greater than 20)");
		int seatNumber = sc.nextInt();
	
		if (username.equals(userName) && password.equals(passWord)) {
			if (seatNumber > 20) {
				System.out.println("Your booked seatnumber was "+seatNumber);
			}
			else {
				System.out.println("You choosed unavailable seat number");
			}			
		}
		else {
			System.out.println("You Entered wrong username or password");
		}
		sc.close();
	}
}
