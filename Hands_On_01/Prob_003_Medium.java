package Hands_On_01;
import java.util.Scanner;

/*Write a program to calculate bill of a job work done as
 follows by using if-else statement. 
a. Rate of typing 3 Rs per page 
b. Printing of 1s copy Rs per page and
 later every copy 3 Rs per page*/

public class Prob_003_Medium {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter No Of Pages Typed: ");
		int typingPages = sc.nextInt();
		
		System.out.println("Enter No Of Copies Printed: ");
		int copies = sc.nextInt();
		
		int typingCost = typingPages * 3;
		
		int printingCost = 0;
		
		if(copies == 1) {
			printingCost = typingPages * 5;
		}
		else {
			printingCost = (typingPages * 5) + 
					(typingPages * 3 * (copies -1));
		}
		System.out.println("The Total Cost: "+
		(typingCost+printingCost));
		
		sc.close();
	}
}
