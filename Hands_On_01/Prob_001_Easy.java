package Hands_On_01;

import java.util.Scanner;

/*PROGRAM TO GET EMPLOYEE DETIALS,
WAGES AND NUMBER OF DAYS WORKED FROM USER AND
FIND TOTAL SALARY*/

public class Prob_001_Easy {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int wages = 1250;

		System.out.println("Enter a Name:");
		String employeeName = sc.nextLine();
		System.out.println("Enter an Age:");
		int employeeAge = sc.nextInt();
		System.out.println("Enter Number of Days Worked:");
		int numberOfDays = sc.nextInt();

		int totalSalary = numberOfDays * wages;

		System.out.println("Employee Details");
		System.out.println("------------------");
		System.out.println("Employee Name: " + employeeName);
		System.out.println("Employee Age: " + employeeAge);
		System.out.println("Number of Days Worked: " + numberOfDays);
		System.out.println("Total Salary: " + totalSalary);
		sc.close();
	}
}
