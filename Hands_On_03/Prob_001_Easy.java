package Hands_On_03;
import java.util.Scanner;

//function to Calculate the Sum of Odd & Even Numbers 

public class Prob_001_Easy {
	
	static void sumOfOdd_Even(int arr[],int n) {
		int oddSum = 0;
		int evenSum = 0;
		for(int i = 0;i < n;i++) {
			if (arr[i] % 2 == 0) {
				evenSum += arr[i];
			}
			else {
				oddSum += arr[i];
			}
		}
		System.out.println("Odd Sum:"+ oddSum);
		System.out.println("Even Sum:"+ evenSum);
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size:");
		int n = sc.nextInt();
		System.out.println("Enter the Elements:");
		int arr[] = new int[n];
		
		for(int  i = 0;i < n;i++) {
			arr[i] = sc.nextInt();
		}
		sumOfOdd_Even(arr,n);
		sc.close();
	}
}
