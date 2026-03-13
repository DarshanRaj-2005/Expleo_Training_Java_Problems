package Java_Basics;
import java.lang.StringBuffer;
import java.lang.StringBuilder;

class StringExample {
	public static String concat1(String s1) {
		return s1.concat(" Ram");               // Concatenates String
	}
	
	//concatenates to string builder
	
	public static StringBuilder concat2(StringBuilder s2) {
		return s2.append(" Raj");
	}
	
	//concatenates to string buffer
	
	public static StringBuffer concat3(StringBuffer s3) {
		return s3.append(" Jaggu");
	}
}

public class String_with_Buffer_and_Builder {

	public static void main(String[] args) {
		String s1 = "Hello";
		System.out.println("Using String: " + StringExample.concat1(s1));
		/*Here the original string value does not change 
		 *it create another object and store the concatenated string*/
		
		StringBuilder s2 = new StringBuilder("Hello");
		System.out.println("Using StringBuilder: " +StringExample.concat2(s2));
		
		StringBuffer s3 = new StringBuffer("Hello");
		System.out.println("Using StringBuffer: " +StringExample.concat3(s3));
	}
}
