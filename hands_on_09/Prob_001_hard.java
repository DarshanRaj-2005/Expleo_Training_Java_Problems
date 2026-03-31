package hands_on_09;

import java.io.*;
import java.nio.file.*;

public class Prob_001_hard {

	public static void main(String[] args) throws Exception {
		File file = new File("C:\\Users\\dhars\\Documents\\JAVA_EXPLEO_Training\\EXPLEO_TRAINING\\src\\hands_on_09\\example.txt");

		if (file.exists()) {
			System.out.println("Path: " + file.getAbsolutePath());
			System.out.println("Readable: " + file.canRead());
			System.out.println("Writable: " + file.canWrite());
			Path link = Paths.get("link.txt");
			Files.createSymbolicLink(link, file.toPath());

			FileWriter fw = new FileWriter(file, true);
			fw.write("March Expense: 5000\n");
			fw.close();

			Files.move(file.toPath(), Paths.get("backup/C:\\Users\\dhars\\Documents\\JAVA_EXPLEO_Training\\EXPLEO_TRAINING\\src\\hands_on_09\\example.txt"), StandardCopyOption.REPLACE_EXISTING);
		}
	}
}
