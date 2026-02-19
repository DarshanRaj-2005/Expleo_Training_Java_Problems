package Java_Basics;
import java.util.Scanner;

public class If_Statement {

	public static void main(String[] args) {
		boolean isSeatAvailable = true;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the seat number to be Booked: ");
		int seat = sc.nextInt();
		//If the condition true statement will execute otherwise it will be skipped
		if (isSeatAvailable) {
			System.out.print("The Booked seat was: "+ seat);
		}
		sc.close();
	}
}
