package hands_on_09;

import java.io.*;
import java.util.Date;

public class Prob_004_easy {

	public static void main(String[] args) {
		File file = new File("C:\\Users\\dhars\\Documents\\JAVA_EXPLEO_Training\\EXPLEO_TRAINING\\src\\hands_on_09\\example.txt");

		System.out.println("Last Modified: " + new Date(file.lastModified()));
	}
}
