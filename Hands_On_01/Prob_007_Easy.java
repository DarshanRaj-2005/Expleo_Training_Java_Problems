package Hands_On_01;

import java.util.Scanner;

/* Program using if statement to check whether 
   the blood donate is eligible or not for donating blood.
   The rules laid down are as follows. 
   a. Age should be above 18 years but less than 55 years. 
   b. Weight should be more than 45kg.*/

public class Prob_007_Easy {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Age: ");
		int age = sc.nextInt();
		System.out.println("Enter Your Weight: ");
		int weight = sc.nextInt();

		if (weight > 45) {
			if (age > 18 && age < 55) {
				System.out.print("Eligible for Blood Donate");
			} else {
				System.out.print("Not Eligible for Blood Donate");
			}
		} else {
			System.out.print("You are under Weight");
		}
		sc.close();
	}
}
