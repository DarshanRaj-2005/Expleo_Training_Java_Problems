package Hands_On_01;
import java.util.*;

//To check whether the given number is Armstrong number or not

public class Prob_009_Medium {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		String number = sc.next();
		int num = Integer.parseInt(number);
		int number2 = num;
		int result = 0;
		
		while(num > 0) {
			int digit = num % 10;
			result += Math.pow(digit,number.length());
			num /= 10;
		}
		if (number2 == result) {
			System.out.print("It is an Armstrong Number");
		}
		else {
			System.out.print("It is not an Armstrong Number");
		}
		sc.close();
	}
}
