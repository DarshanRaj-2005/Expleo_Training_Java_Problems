package Hands_On_02;

/*Write a program to add even and odd numbers from 1 to 10.
Store and display their results in two separate arrays.*/

public class Prob_001_Easy {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		int oddArray[] = new int[5];
		int evenArray[] = new int[5];
		int o = 0, e = 0;
		
		for(int i = 0;i < 10;i++) {
			if (arr[i] % 2 != 0) {
				oddArray[o] = arr[i];
				o++;
			}
			else {
				evenArray[e] = arr[i];
				e++;
			}
		}
		System.out.println("Odd Array: ");
		for(int i = 0;i < oddArray.length;i++) {
			System.out.print(oddArray[i]);
		}
		System.out.println();
		System.out.println("Even Array: ");
		for(int i = 0;i < oddArray.length;i++) {
			System.out.print(evenArray[i]);
		}
		
	}
}
