package Hands_On_02;
import java.util.Scanner;

/*The aim is to identify the greatest element 
therein*/

public class Prob_005_Easy {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int size = sc.nextInt();
		int arr[] = new int[size];
		
		System.out.println("Enter the Elements:");
		for(int i = 0;i < size;i++) {
			arr[i] = sc.nextInt();
		}
	
		int max = arr[0];
		
		for(int i = 0;i < size;i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("The Greatest Element:"+ max);
		sc.close();
	}
}
