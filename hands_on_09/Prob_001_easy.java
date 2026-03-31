package hands_on_09;

import java.io.*;
import java.util.*;

public class Prob_001_easy {

	public static void main(String[] args) throws Exception {
		File file = new File("C:\\Users\\dhars\\Documents\\JAVA_EXPLEO_Training\\EXPLEO_TRAINING\\src\\hands_on_09\\example.txt");
		Scanner sc = new Scanner(file);

		String longest = "";

		while (sc.hasNext()) {
			String word = sc.next();
			if (word.length() > longest.length()) {
				longest = word;
			}
		}

		System.out.println("Longest word: " + longest);
		sc.close();
	}

}
