package Hands_On_03;
import java.util.Scanner;

/* Get the salary per month and hike from user and
  the write a C# program to calculate new salary with hike. 
Hint: The formula is Salary hike = oldSalaryPerMonth +
 (oldSalaryPerMonth X hike/100) */

public class Prob_003_Easy {
	
	static double calculateSalary(double monthSalary,double hike) {
		double finalSalary = (monthSalary + (monthSalary * hike)/100);
		return finalSalary;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Salary per Month:");
		double monthSalary = sc.nextDouble();
		
		System.out.println("Enter Hike in percentage:");
		double hike = sc.nextDouble();
		
		System.out.println("Final Salary after Hike:"+
		calculateSalary(monthSalary,hike));
		sc.close();
	}
}
