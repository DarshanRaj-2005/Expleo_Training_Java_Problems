package Java_Basics;

//Program for string array using for each loop

public class Array_1D_String {
	
	public static void main(String[] args) {
		
		String[] arr = new String[3];
		arr[0] = "Dhoni";
		arr[1] = "Kohli";
		arr[2] = "Rohit";
		
		for(String names : arr) {
			System.out.print(names+" ");
		}
	}
}
