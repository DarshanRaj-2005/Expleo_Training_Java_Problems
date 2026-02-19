package Hands_On_02;
import java.util.Scanner;

/*Ivan has a list of n elements and he need to eliminate
  the duplicate numbers from the list and to create 
  the new list to hold the unique number*/

public class Prob_004_Medium {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size:");
		int n = sc.nextInt();
		
		System.out.println("Enter the Element: ");
		int arr[] = new int[n];
		
		for(int i = 0;i < n;i++) {
			arr[i] = sc.nextInt();
		}
		
		int arr2[] = new int[n];
		int k = 0;
		
		for(int i = 0;i < n;i++) {
			int count = 0;
			for(int j = 0;j < n;j++) {
				if(arr[i] == arr[j]) {
					count++;
				}
			}
			if (count == 1) {
				arr2[k] = arr[i];
				k++;
			}
		}
		
		for(int i = 0;i < k;i++) {
			System.out.print(arr2[i]+" ");
		}
		sc.close();
	}
}
