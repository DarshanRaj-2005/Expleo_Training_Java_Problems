package Java_Basics;

public class Explicit_Type_Conversion {

	public static void main(String[] args) {
		double d = 10000000000.4;
		
		//Here we are converting double to long from large data type to small data type
		long l = (long)d;
		
		//Here we are converting long to integer from large data type to small data type
		int i = (int)l;
		
		System.out.println("Value of Double: "+d);
		System.out.println("Type Conversion Double To Long: "+l);
		System.out.println("Type Conversion Long To Int: "+i);

	}
}
