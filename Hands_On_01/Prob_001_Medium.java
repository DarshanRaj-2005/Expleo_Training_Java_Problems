package Hands_On_01;
import java.util.Scanner;

/*there are 86400 seconds per day, 
 write a program that calculates how 
 many seconds there are in a week if a week is 7 days.*/

public class Prob_001_Medium {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a week: ");
		int weeks = sc.nextInt();
		int days = 7;
		int seconds = 86400;
		
		System.out.print("Total Seconds for a week: "+
		weeks * days * seconds);
		sc.close();
	}
}
