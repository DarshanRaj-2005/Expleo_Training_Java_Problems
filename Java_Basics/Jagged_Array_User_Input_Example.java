package Java_Basics;
import java.util.Scanner;

//Program for jagged array getting input from user

public class Jagged_Array_User_Input_Example {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int book[][] = new int[2][];
		
		for(int i=0;i<book.length;i++) {
			System.out.println("Enter length for "+i+" index:");
			int col = sc.nextInt();
			book[i]=new int[col];
			System.out.println("Enter the Elements:");
			for(int j=0;j<col;j++) {
				book[i][j] = sc.nextInt();
			}
		}
		for(int i=0;i<book.length;i++) {
			for(int j=0;j<book[i].length;j++) {
				System.out.print(book[i][j]);
			}
			System.out.println();
		}
		sc.close();
	}
}
