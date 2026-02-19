package Hands_On_03;
import java.util.Scanner;

/*The departments that have participated in the recruitment
  drive are CS, EC, ME. Help the college to find the 
  department getting maximum placements.
  Check for all the possible output given in the sample snapshot.  
  Note: If any input is negative, the output should be "Input is invalid".
  If all departments have equal number of placements,
  the output should be "None of the department has 
  got the highest placement". */

public class Prob_002_Hard {
	
	static void calculatePlacement(int cs,int ec,int me) {
		if (cs < 0 || ec < 0 || me < 0) {
			System.out.println("Input is Invalid");
		}
		else if (cs == ec && ec == me) {
			System.out.println("None of the department has "
					+ "got the highest placement");
		}
		else if (cs == ec) {
			System.out.println("Highest Placement CS EC");
		}
		else if (cs == me) {
			System.out.println("Highest Placement CS ME");
		}
		else if (me == ec) {
			System.out.println("Highest Placement ME EC");
		}
		else if (cs > ec && cs > me) {
			System.out.println("Highest Placement CS");
		}
		else if (ec > me) {
			System.out.println("Highest Placement EC");
		}
		else {
			System.out.println("Highest Placement ME");
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of students placed in CS:");
		int cs = sc.nextInt();
		
		System.out.println("Enter the no of students placed in EC:");
		int ec = sc.nextInt();
		
		System.out.println("Enter the no of students placed in ME:");
		int me = sc.nextInt();
		
		calculatePlacement(cs,ec,me);
		
		sc.close();
	}
}
