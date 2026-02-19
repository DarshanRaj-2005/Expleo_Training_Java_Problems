package Hands_On_03;
import java.util.Scanner;

//eligible to vote if his/her age is greater than or equal to 18.

public class Prob_004_Easy {
	
	static void checkEligible(int age) {
		if (age >= 18) {
			System.out.println("Eligible to Vote");
		}
		else {
			System.out.println("Not Eligible to Vote");
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age:");
		int age = sc.nextInt();
		checkEligible(age);
		sc.close();
	}
}
