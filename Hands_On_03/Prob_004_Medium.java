package Hands_On_03;
import java.util.Scanner;

/*  Age should be above 18 yrs but not more than 55 yrs. 
    Weight should be more than 45kg. */

public class Prob_004_Medium {

	static void calculateEligible(int age, int weight) {
		
		if(age > 18 && age <55 && weight >45) {
			System.out.println("Eligible for Blood Donation");
		}
		else {
			System.out.println("Not Eligible for Blood Donation");
		}
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your age:");
		int age = sc.nextInt();
		System.out.println("Enter your weight:");
		int weight = sc.nextInt();
		
		calculateEligible(age,weight);
	}

}
