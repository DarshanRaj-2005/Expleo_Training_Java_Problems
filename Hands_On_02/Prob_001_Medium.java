package Hands_On_02;
import java.util.Scanner;

/*Write a program to check whether a specific element is
  present in this Array or not. */

public class Prob_001_Medium {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size:");
		int n = sc.nextInt();
		
		System.out.println("Enter the Elements:");
		int arr[] = new int[n];
		
		for(int i = 0;i < n;i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter the Key:");
		int key = sc.nextInt();
		int flag = 0;
		for(int i = 0;i < n;i++) {
			if (arr[i] == key) {
				flag = 1;
			}
		}
		if (flag == 1) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		
		sc.close();
	}
}
