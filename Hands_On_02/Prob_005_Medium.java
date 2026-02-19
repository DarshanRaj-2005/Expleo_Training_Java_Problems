package Hands_On_02;
import java.util.Scanner;

/*Teena having elements as 10,10,10,10,20,20,20,20,40,40,50,50,30 and she 
maintained in the data structure “my_record”. She needs to find the frequency of 
element in my_report and display the count*/

public class Prob_005_Medium {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int arr[] = {10,10,10,10,20,20,20,20,40,40,50,50,30};
		
		for(int i = 0;i < arr.length;i++) {
			int count = 0;
			if (arr[i] == -1) {
				continue;
			}
			for(int j = i + 1;j < arr.length;j++) {
				if(arr[i] == arr[j]) {
					count++;
					arr[j] = -1;
				}
			}
			System.out.println("Element "+arr[i]+" repeated "+ (count + 1) +" times");
		}
		sc.close();
	}
}
