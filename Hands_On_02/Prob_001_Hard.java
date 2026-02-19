package Hands_On_02;
import java.util.Scanner;

/*First line contains of a single line of input,
an integer N denoting no. of friends in the group. 
Next line contains N space separated integers Xi denoting the no.
chocolates ith friend has. 
Output: 
Output "Yes" if it is possible to share equally else "No"*/

public class Prob_001_Hard {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of Friends:");
		int n = sc.nextInt();
		System.out.println("Enter the no of Chocolates that each have:");
		int chocolate[] = new int[n];
		
		for(int i = 0;i < n;i++) {
			chocolate[i] = sc.nextInt();
		}
		int sumOfChocolate = 0;
		
		for(int i = 0;i < n;i++) {
			sumOfChocolate += chocolate[i];
		}
		
		if (sumOfChocolate % n == 0) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		sc.close();
	}

}
