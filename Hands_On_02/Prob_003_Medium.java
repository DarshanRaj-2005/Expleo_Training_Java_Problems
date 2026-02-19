package Hands_On_02;
import java.util.Scanner;

/* program to count a total number of duplicate 
  and unique elements in the given array.*/

public class Prob_003_Medium {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size:");
		int n = sc.nextInt();
		
		System.out.println("Enter the Elements:");
		int arr[] = new int[n];
		
		for(int i = 0;i < n;i++) {
			arr[i] = sc.nextInt();
		}
		
		int duplicate = 0;
		int unique = 0;
		for(int i = 0;i < n;i++) {
			if(arr[i] == -1) {
				continue;
			}
			boolean isDuplicate = false;
			for(int j = i + 1;j < n;j++) {
				if (arr[i] == arr[j]) {
					duplicate++;
					arr[j] = -1;
					isDuplicate = true;
				}
			}
			if (!isDuplicate) {
				unique++;
			}
		}
		System.out.println("Duplicate: "+duplicate);
		System.out.println("Unique: "+unique);
		sc.close();
	}
}
