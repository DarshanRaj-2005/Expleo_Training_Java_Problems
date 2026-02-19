package Hands_On_01;

import java.util.Scanner;

/*Program to print the following number pattern 
Sample I/O 
Enter the N value: 5 
1 
2  2 
3  3  3 
4  4  4  4 
5  5  5  5  5*/

public class Prob_010_Easy {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i + " ");
			}
			System.out.println("");
		}
		sc.close();
	}
}
