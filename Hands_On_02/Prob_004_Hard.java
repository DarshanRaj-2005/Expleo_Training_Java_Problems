package Hands_On_02;
import java.util.Arrays;
import java.util.Scanner;

//Merge three array and sort it

public class Prob_004_Hard {

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
		
		System.out.println("Enter size of second array:");
		int n3 = sc.nextInt();
		int arr3[] = new int[n3];
		System.out.println("Enter elements of second array:");
		for(int i = 0; i < n3; i++) {
			arr3[i] = sc.nextInt(); 
		}
		
		int arr4[] = new int[n1+n2+n3];
		for(int i = 0;i < n1;i++) {
			arr4[i] = arr1[i];
			
		}
		for(int i = 0;i < n2;i++) {
			arr4[n1 + i] = arr2[i];
			
		}
		for(int i = 0;i < n3;i++) {
			arr4[n1 + n2 + i] = arr3[i];
		}
		Arrays.sort(arr4);
		for(int i = 0;i < arr4.length;i++) {
			System.out.print(arr4[i]+" ");
		}
		sc.close();
	}
}
