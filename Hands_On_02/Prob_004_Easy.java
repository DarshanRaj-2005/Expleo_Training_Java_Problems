package Hands_On_02;
import java.util.Scanner;

//Write a program to find the frequency of each element in the array 

public class Prob_004_Easy {

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
			if (arr[i] == -1) {
				continue;
			}
			int count = 1;
			for(int j = i + 1;j < size;j++) {
				if(arr[i] == arr[j]) {
					count++;
					arr[j] = -1;
				}
			}
		System.out.println(arr[i]+" is repeated "+count+" times");
		}
		sc.close();
	}
}
