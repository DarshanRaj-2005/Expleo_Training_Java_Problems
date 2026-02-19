package Hands_On_02;
import java.util.Scanner;

/* program to find the missing number in a 
given integer array of 1 to 100.*/

public class Prob_008_Easy {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values: ");
		int arr[] = new int[100];
		
		for(int i = 0;i < 99;i++) {
			arr[i] = sc.nextInt();
		}
		int sum = 0;
		int total = 5050;
		
		for(int i = 0;i < 99;i++) {
			sum += arr[i];
		}
		
		System.out.println("Missing Number: "+(total - sum));
		sc.close();
	}

}
