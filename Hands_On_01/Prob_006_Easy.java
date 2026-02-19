package Hands_On_01;

import java.util.Scanner;

/* Program that reads an integer continuously and 
   displays "Hello" as many times as the value of the integer.
   If the user enters a negative number, the insertion of 
   integers should end and the program should display 
   the total number of the displayed "Hello" */

public class Prob_006_Easy {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int count = 0;
		while (true) {
			System.out.println("Enter the Number:");
			int num = sc.nextInt();

			if (num > 0) {
				for (int i = 0; i < num; i++) {
					System.out.println("Hello");
					count++;
				}
			} else {
				break;
			}
		}
		System.out.println("The Total Count: " + count);
		sc.close();
	}
}
