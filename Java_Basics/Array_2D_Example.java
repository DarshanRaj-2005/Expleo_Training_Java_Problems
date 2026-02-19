package Java_Basics;

//Program for 2D array using the for loop

public class Array_2D_Example {

	public static void main(String[] args) {
		
		int[][] arr = new int[][] {{1,2,5},{3,4},{5,6,7}};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
}
