package hands_on_09;

import java.io.*;

public class Prob_002_easy {

	public static void main(String[] args) {
		File folder = new File("C:\\Users\\dhars\\Documents\\JAVA_EXPLEO_Training\\EXPLEO_TRAINING\\src\\hands_on_09\\example");
		String extension = ".txt";

		File[] files = folder.listFiles();

		for (File file : files) {
			if (file.getName().endsWith(extension)) {
				System.out.println(file.getName());
			}
		}
	}
}
