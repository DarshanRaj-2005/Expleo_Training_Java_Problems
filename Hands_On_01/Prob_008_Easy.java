package Hands_On_01;

import java.util.Scanner;

/*Program to check whether the given Character is an Alphabet/
  Digit /Special Symbol using if-else-if statement*/

public class Prob_008_Easy {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Character ( Alphabet/ Digit / Symbol): ");
		char character = sc.next().charAt(0);

		if ((character >= 'a' && character <= 'z') || (character >= 'A' && character <= 'Z')) {
			System.out.print("The given character is Alphabet");
		} else if (character >= '0' && character <= '9' || character <= '0') {
			System.out.print("The given character is Digit");
		} else {
			System.out.print("The given character is Symbol");
		}
		sc.close();
	}
}
