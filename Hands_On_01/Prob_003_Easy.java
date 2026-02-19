package Hands_On_01;

import java.util.Scanner;

/*Switch case structure to print the appropriate message
  to recognize the entered character is vowel,
  consonant or symbol*/

public class Prob_003_Easy {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String input = sc.next().toLowerCase();
		char character = input.charAt(0);

		switch (character) {

		case 'a':
		case 'i':
		case 'e':
		case 'o':
		case 'u':
			System.out.print("The Given Character is Vowel");
			break;

		default:
			if (character >= 'a' && character <= 'z') {
				System.out.print("The Given Character is Not a Vowel");
			} else {
				System.out.print("The Given is a Symbol");
			}
			break;
		}
		sc.close();
	}
}
