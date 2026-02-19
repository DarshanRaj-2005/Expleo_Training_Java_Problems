package Hands_On_01;

import java.util.Scanner;

//Program to print sum of digits of a given number

public class Prob_009_Easy {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a digit:");
		int digit = sc.nextInt();
		int digit2 = 0;
		int result = 0;

		while (digit > 0) {
			digit2 = digit % 10;
			result += digit2;
			digit /= 10;
		}
		System.out.print("Sum of Digits: " + result);
		sc.close();
	}
}
