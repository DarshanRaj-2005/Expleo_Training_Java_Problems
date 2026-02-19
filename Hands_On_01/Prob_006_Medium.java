package Hands_On_01;
import java.util.Scanner;

/*Calculate purchase amount to be paid after discount using if-else.
  Consider 10 % discount for the Sale amount above 1000 and
  5% discount for the Sale amount less than 1000*/

public class Prob_006_Medium {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Quantity: ");
		int quantity = sc.nextInt();
		
		System.out.println("Enter the Price: ");
		int price = sc.nextInt();
		int purchaseAmount = price * quantity;
		
		System.out.println("Purchased Amount: "+purchaseAmount);
		
		if (purchaseAmount >= 1000) {
			double discount = purchaseAmount * 0.10;
			System.out.print("Total Amount after Discount: "+ (purchaseAmount - discount));
		}
		else if (purchaseAmount >= 1000) {
			double discount = purchaseAmount * 0.05;
			System.out.print("Total Amount after Discount: "+ (purchaseAmount - discount));
		}
		sc.close();
	}
}
