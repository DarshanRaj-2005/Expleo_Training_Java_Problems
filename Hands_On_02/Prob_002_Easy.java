package Hands_On_02;
import java.util.Scanner;

//Write a program to sort the elements of an array in sequence. 

public class Prob_002_Easy {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the array:");
		int size = sc.nextInt();
		int arr[] = new int[size];
		
		System.out.println("Enter the Elements:");
		for(int i = 0;i < size;i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0;i < size;i++) {
			for(int j = i+1;j < size;j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("Elements after sorted: ");
		for(int i = 0;i < size;i++) {
			System.out.print(arr[i]+" ");
		}
		sc.close();
	}
}
