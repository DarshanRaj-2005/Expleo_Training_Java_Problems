package Hands_On_01;
import java.util.Scanner;

/*Write a program to calculate bill for Internet browsing. The conditions are:
a. 1 hr 50 Rs.
b. 1 min 1 Re.
c. 5 hrs 200 Rs.
d. User can only browse maximum 7 hrs*/

public class Prob_004_Medium {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Hours:");
		int hour = sc.nextInt();
		
		System.out.println("Enter the Minutes:");
		int minutes = sc.nextInt();
		
		int bill = 0;
		
		if (hour >= 7 && minutes > 0) {
			System.out.println("You reached the limit");
		}
		else if (hour == 5 && minutes == 0) {
			bill = 200;
		}
		else {
				bill = (hour * 50) + minutes;
		}
		System.out.print(bill);
		sc.close();
	}
}
