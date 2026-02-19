package Java_Basics;

public class TypePromotion {

	public static void main(String[] args) {
		
		//Doing Type Promotion using different data types and converting type by expression
        byte b = 42;
		char c = 'a';
		short s = 1024;
		int i = 50000;
		float f = 5.67f;
		double d = 0.1234;
		
		//Here the result is converted as double because other type can't store that decimal value
		double result = (f*b) + (i/c) - (d*s);

		System.out.println("result = "+ result);
	}
}
