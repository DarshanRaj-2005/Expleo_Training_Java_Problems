package hands_on_09;

import java.io.*;

public class Prob_001_Medium {

	public static void main(String[] args) throws Exception {

		String option = "";
		String search = "";
		String filename = "C:\\Users\\dhars\\Documents\\JAVA_EXPLEO_Training\\EXPLEO_TRAINING\\src\\hands_on_09\\example.txt";

		if (args.length == 2) {
			search = args[0];
			filename = args[1];
		} else if (args.length == 3) {
			option = args[0];
			search = args[1];
			filename = args[2];
		}

		BufferedReader br = new BufferedReader(new FileReader(filename));
		String line;
		int count = 0;

		while ((line = br.readLine()) != null) {
			boolean contains = line.contains(search);

			if (option.equals("-c") && contains)
				count++;
			else if (option.equals("-v") && !contains)
				System.out.println(line);
			else if (option.equals("") && contains)
				System.out.println(line);
		}

		if (option.equals("-c")) {
			System.out.println("Count: " + count);
		}

		br.close();
	}

}
