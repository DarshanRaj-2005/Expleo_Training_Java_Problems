package Hands_On_01;
import java.util.Scanner;

/*Accepts a string and calculate the number of digits and letters.
Sample I/O:
Enter String: India became independent in 1947
Output:
Letters: 24, Digits: 4, Other Symbols: 4*/

public class Prob_008_Medium {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Text: ");
		String text = sc.nextLine().toLowerCase();
		int wordCount = 0;
		int digitCount = 0;
		int symbolCount = 0;
		
		for(int i = 0;i < text.length();i++) {
			if (text.charAt(i) >= 'a' && text.charAt(i) <= 'z') {
				wordCount++;
			}
			else if (text.charAt(i) >= '0' && text.charAt(i) <= '9') {
				digitCount++;
			}
			else {
				symbolCount++;
			}
		}
		System.out.println("Word Count: "+wordCount);
		System.out.println("Digit Count: "+digitCount);
		System.out.println("Symbol Count: "+symbolCount);
		sc.close();
	}
}
