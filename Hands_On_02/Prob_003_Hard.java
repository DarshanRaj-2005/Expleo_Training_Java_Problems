package Hands_On_02;
import java.util.Scanner;

/*If the value divided by 7 (black number), divided by 8(White number) and replace it 
 * with another number.*/

public class Prob_003_Hard {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[100];
		
		System.out.println("Enter the Elements(-1 To stop): ");
		int count = 0;
		while(true) {
			arr[count] = sc.nextInt();
			if (arr[count] == -1) {
				break;
			}
			count++;
		}
		for(int i = 0;i < count;i++) {
			if (arr[i] % 7 == 0 && arr[i] % 8 == 0) {
				arr[i] = -6;
			}
			else if (arr[i] % 7 == 0) {
				arr[i] = -2;
			}
			else if(arr[i] % 8 == 0) {
				arr[i] = -9;
			}
		}
		
		for(int i = 0;i < count;i++) {
			System.out.println(arr[i]);
		}
		sc.close();
	}
}
