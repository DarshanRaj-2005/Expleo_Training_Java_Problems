package Hands_On_01;

import java.util.Scanner;

/*Ana planned to choose the four digit lucky number for her car.
  Her lucky numbers are 3, 5 and 7. Help her to find the number,
  whose sum is divisible by 3 or 5 or 7. Provide a valid car number,
  Fails to provide a valid input then display that number
  is not a valid car number. 
  Sample Input 1: 
  Enter the car no: 1234 
  Sample Output 1: 
  Lucky Number */

public class Prob_003_Hard {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the car no: ");
		int carNumber = sc.nextInt();
		int carNum = carNumber;
		int digit = 0;
		int result = 0;
		int count = 0;

		while (carNumber > 0) {
			digit = carNumber % 10;
			result += digit;
			carNumber /= 10;
			count++;
		}
		if (count == 4) {
			if (result % 3 == 0 || result % 5 == 0 || result % 7 == 0) {
				System.out.print("Lucky Number");
			} else {
				System.out.print("Sorry it's not my lucky number");
			}
		} else {
			System.out.print(carNum + " is not a valid car number");
		}
		sc.close();
	}
}
