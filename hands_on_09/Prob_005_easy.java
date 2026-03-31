package hands_on_09;

import java.io.*;

public class Prob_005_easy {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\dhars\\Documents\\JAVA_EXPLEO_Training\\EXPLEO_TRAINING\\src\\hands_on_09\\example.txt"));
		String line;
		String content = "";

		while ((line = br.readLine()) != null) {
			content += line + "\n";
		}

		System.out.println(content);
		br.close();
	}
}
