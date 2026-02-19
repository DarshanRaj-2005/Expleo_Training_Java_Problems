package Hands_On_02;
import java.util.Scanner;

/*Mark enters randomly twenty five numbers from the
 keyboard and stores it into an array.
 He wants to search if the number is present in
 the array and if it is present,
 he needs to display the number of times
 it appears in the array.*/

public class Prob_006_Medium {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 25 Elements:");
		int arr[] = new int[25];
 		for(int i = 0;i < arr.length;i++) {
			arr[i] = sc.nextInt();
		}
 		System.out.println("Enter the Element to be Searched:");
 		int key = sc.nextInt();
 		
 		int count = 0;
 		
 		for(int i = 0;i < arr.length;i++) {
 			if(arr[i] == key) {
 				count++;
 			}
 		}
 		if (count > 0) {
 			System.out.println("Element Found");
 		}
 		else {
 			System.out.println("Element Not Found");
 		}
		System.out.println("The count of Repeated: "+count);
		sc.close();
	}
}
