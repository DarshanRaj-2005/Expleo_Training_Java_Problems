package Java_Basics;

public class Implicit_Type_Conversion {

	public static void main(String[] args) {
		int i = 100;
		
		//Here we are converting integer to long from small data type to large data type
		long a = i;
		
		//Here we are converting long to integer from small data type to large data type
		float b = a;
		
		System.out.println("Value of Int: "+i);
		System.out.println("Type Conversion of Int To Long: "+a);
		System.out.println("Type Conversion of Long To Float: "+b);

	}

}
