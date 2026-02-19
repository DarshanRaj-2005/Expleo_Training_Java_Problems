package Hands_On_03;
import java.util.*;

/*If the appraisal rating is between 1 and 4, the increment is 10% of the salary. 
 If the appraisal rating is between 4.1 and 7, the increment is 25% of the salary. 
 If the appraisal rating is between 7.1 and 10, the increment is 30% of the salary.*/

public class Prob_001_Hard {
	
	static void calculateAppraisal(int salary, double rating) {
		
		if (salary <= 0 || rating < 1 || rating > 10) {
			System.out.println("Invalid Input");
		}
		else if (rating >= 1 && rating <= 4) {
			System.out.println((salary * 0.10) + salary);
		}
		else if (rating > 4 && rating <= 7) {
			System.out.println((salary * 0.25) + salary);
		}
		else if (rating > 7 && rating <= 10) {
			System.out.println((salary * 0.30) + salary);
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Salary:");
		int salary = sc.nextInt();
		
		System.out.println("Enter the Appraisal Rating:");
		double rating = sc.nextDouble();
		
		calculateAppraisal(salary,rating);
		
		sc.close();
	}

}
