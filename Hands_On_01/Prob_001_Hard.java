package Hands_On_01;
import java.util.Scanner;

/* Write a program to sort numbers 0 to 9,
   alphabets in upper and lowercase using equivalent ASCII values*/

public class Prob_001_Hard {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Text: ");
		String text = sc.nextLine();
		char[] digit = text.toCharArray();
		
		for(int i = 0;i < digit.length;i++) {
			for(int j = 0;j < digit.length;j++) {
				if (digit[i] < digit[j]) {
					char temp = digit[i];
					digit[i] = digit[j];
					digit[j] = temp;
				}
			}
		}
		
		for(int i = 0;i < digit.length;i++) {
			System.out.print(digit[i]);
		}
		sc.close();
	}
}
