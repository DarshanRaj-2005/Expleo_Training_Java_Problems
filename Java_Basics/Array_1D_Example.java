package Java_Basics;

//program for integer array using for loop

public class Array_1D_Example {

	public static void main(String[] args) {
		
		int[] arr = new int[3];
		arr[0] = 10;
		arr[1] = 20;
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("Elements at index "+ i +" is "+arr[i]);
		}	
	}
}
