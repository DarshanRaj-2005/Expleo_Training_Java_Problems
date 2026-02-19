package Hands_On_02;
import java.util.Scanner;

/* program to merge two arrays into a third array.
   Display the values of three arrays.*/

public class Prob_007_Easy {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of first array:");
		int n1 = sc.nextInt();
		int arr1[] = new int[n1];
		System.out.println("Enter elements of first array:");
		for(int i = 0; i < n1; i++) {
			arr1[i] = sc.nextInt();
		}
	   
		System.out.println("Enter size of second array:");
		int n2 = sc.nextInt();
		int arr2[] = new int[n2];
		System.out.println("Enter elements of second array:");
		for(int i = 0; i < n2; i++) {
			arr2[i] = sc.nextInt(); 
		}
		
		int arr3[] = new int[n1+n2];
		for(int i = 0;i < n1;i++) {
			arr3[i] = arr1[i];
		}
		for(int i = 0;i < n2;i++) {
			arr3[n1 + i] = arr2[i];
		}
		
		for(int i = 0;i < arr3.length;i++) {
			System.out.print(arr3[i]+" ");
		}
		sc.close();
	}
}
