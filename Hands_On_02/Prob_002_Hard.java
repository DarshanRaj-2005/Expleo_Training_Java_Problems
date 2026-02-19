package Hands_On_02;
import java.util.Scanner;

/* Each one will get one chance to roll the dice.
  Dice values are recorded in two different tables.
  After 10 turns, the winner has to be decided by
  calculating each value recorded in each table. */

public class Prob_002_Hard {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Arun Dice Choice:");
		int arunChoice[] = new int[10];
		
		for(int i = 0;i < 10;i++) {
			arunChoice[i] = sc.nextInt();
		}
		
		System.out.println("Enter the Naveen Dice Choice:");
		int naveenChoice[] = new int[10];
		
		for(int i = 0;i < 10;i++) {
			naveenChoice[i] = sc.nextInt();
		}
		
		int sumOfArun = 0;
		for(int i = 0;i < 10;i++) {
			sumOfArun += arunChoice[i];
		}
		
		int sumOfNaveen = 0;
		for(int i = 0;i < 10;i++) {
			sumOfArun += naveenChoice[i];
		}
		
		if (sumOfArun > sumOfNaveen) {
			System.out.println("Arun Wins!!!");
		}
		else {
			System.out.println("Naveen Wins!!!");
		}
		sc.close();
	}
}
