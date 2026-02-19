package Hands_On_01;
import java.util.Scanner;

/*Mark is purchasing certain glossary items in a supermarket. 
  While purchasing certain items, 
  a discount of 15% is offered to him 
  if the quantity purchased is more than 500. 
  Help, Mark to calculate the total expenses. */

public class Prob_002_Medium {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total amount: ");
		int amount = sc.nextInt();
		
		if (amount > 500) {
			System.out.println("You have 15% discount");
			double discount = amount * 0.15;
			System.out.print("The Amount After Discount: "+(amount - discount));
		}
		else {
			System.out.print("Your Total Amount is Less than 500. No Discount");
		}
		sc.close();
	}
}
