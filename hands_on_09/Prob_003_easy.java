package hands_on_09;

import java.io.*;

public class Prob_003_easy {

	public static void main(String[] args) {
		File file = new File("C:\\Users\\dhars\\Documents\\JAVA_EXPLEO_Training\\EXPLEO_TRAINING\\src\\hands_on_09\\example.txt");

		if (file.exists()) {
			System.out.println("File/Directory exists");
		} else {
			System.out.println("Does not exist");
		}
	}
}
