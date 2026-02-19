package Hands_On_02;
import java.util.Scanner;

/*Write a program to find the duplicate number 
  on a given integer array.*/

public class Prob_006_Easy {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n Number:");
		int n = sc.nextInt();
		System.out.println("Enter the Array Elements:");
		int arr[] = new int[n];
		
		for(int i = 0;i < n;i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0;i < n;i++) {
			for(int j = i + 1;j < n;j++) {
				if(arr[i] == arr[j]) {
					System.out.print(arr[i]+" ");
				}
			}
		}
		sc.close();
	}
}
