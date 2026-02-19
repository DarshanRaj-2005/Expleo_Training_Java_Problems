package Hands_On_01;
import java.util.Scanner;

public class Prob_004_Hard {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Amount: ");
		double amount = sc.nextDouble();
		
		if (amount < 2000) {
			double discount = amount * 0.05;
			System.out.print("The Amount after Discount: "+ (amount - discount));
		}
		else if (amount >= 2000 && amount <5000) {
			double discount = amount * 0.25;
			System.out.print("The Amount after Discount: "+ (amount - discount));
		}
		else if (amount >= 5000 && amount <10000) {
			double discount = amount * 0.35;
			System.out.print("The Amount after Discount: "+ (amount - discount));
		}
		else if (amount >= 10000) {
			double discount = amount * 0.50;
			System.out.print("The Amount after Discount: "+ (amount - discount));
		}
		sc.close();
	}
}
