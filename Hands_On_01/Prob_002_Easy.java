package Hands_On_01;

import java.util.Scanner;

//Program to check the number is divisor of 7

public class Prob_002_Easy {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number:");
		int number = sc.nextInt();
		if (number % 7 == 0) {
			System.out.print("The given is Divisor of 7");
		} else {
			System.out.print("The given is Not a Divisor of 7");
		}
		sc.close();
	}
}
