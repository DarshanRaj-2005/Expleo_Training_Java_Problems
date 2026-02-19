package Java_Basics;

//Program for jagged array example

public class Jagged_Array_Example {

	public static void main(String[] args) {
		
		int book[][] = new int[3][];
		book[0] = new int[] {4,5,6};
		book[1] = new int[] {1,2};
		book[2] = new int[] {5,6,7,8};
		
		for(int i=0;i<book.length;i++) {
			for(int j=0;j<book[i].length;j++) {
				System.out.print(book[i][j]);
			}
			System.out.println();
		}
	}
}
