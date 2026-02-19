package Hands_On_01;
import java.util.Scanner;

/*Basic Salary <= 10000 : HRA = 20%, DA = 80% 
Basic Salary is between 10001 to 20000: HRA = 25%, DA = 90% 
Basic Salary >= 20001 : HRA = 30%, DA = 95% 
Gross Salary=Basic Salary + HRA + DA */

public class Prob_007_Medium {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Basic Salary: ");
		int basicSalary = sc.nextInt();
		
		double HRA = 0.0;
		double DA = 0.0;
		
		if (basicSalary <= 10000) {
			HRA = basicSalary * 0.20;
		    DA = basicSalary * 0.80;
			System.out.print("Gross Salary: "+ (basicSalary + HRA + DA));
		}
		else if (basicSalary > 10000 && basicSalary <= 20000) {
			HRA = basicSalary * 0.25;
			DA = basicSalary * 0.90;
			System.out.print("Gross Salary: "+ (basicSalary + HRA + DA));
		}
		else if (basicSalary > 20000) {
			HRA = basicSalary * 0.30;
			DA = basicSalary * 0.95;
			System.out.print("Gross Salary: "+ (basicSalary + HRA + DA));
		}
		sc.close();
	}
}
