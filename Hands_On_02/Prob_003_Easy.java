package Hands_On_02;
import java.util.Scanner;

//Find max or min value in an array of primitives

public class Prob_003_Easy {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int size = sc.nextInt();
		int arr[] = new int[size];
		
		System.out.println("Enter the Elements:");
		for(int i = 0;i < size;i++) {
			arr[i] = sc.nextInt();
		}
		
		int min = arr[0];
		int max = arr[0];
		
		for(int i = 0;i < size;i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
			else if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("Max:"+max);
		System.out.println("Min:"+min);
		sc.close();
	}
}
