package hands_on_10;

import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Iterator;

/*Suppose you have a set s containing some strings. Write a code fragment that 
uses an iterator to print out each element in s and also compute the result of 
concatenating all of these strings together. 

Elements in the Set : Java 
Elements in the Set : Hello 
Elements in the Set : Programming 
Elements in the Set : World 
Concatenated result: Java Hello Programming World
*/

public class Prob_002 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Set<String> elements = new LinkedHashSet<>();

		// Without using n we can use string array and split by words

		for (int i = 0; i < 5; i++) {
			System.out.print("Elements in Set :");
			elements.add(sc.nextLine());
		}

		Iterator<String> i = elements.iterator();

		while (i.hasNext()) {
			String line = i.next();
			System.out.print(line + " ");
		}
		sc.close();
	}
}
