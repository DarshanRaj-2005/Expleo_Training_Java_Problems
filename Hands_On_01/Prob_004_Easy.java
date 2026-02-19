package Hands_On_01;

import java.util.Scanner;

//Program using do-while loop to evaluate the series 1+2+3+…..+i

public class Prob_004_Easy {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int i = sc.nextInt();
		int num = 1;
		int result = 0;

		do {
			result += num;
			num++;
		} while (num <= i);
		System.out.print("The Final Result: " + result);
		sc.close();
	}
}
