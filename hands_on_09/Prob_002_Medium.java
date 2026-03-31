package hands_on_09;

import java.io.*;

public class Prob_002_Medium {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\dhars\\Documents\\JAVA_EXPLEO_Training\\EXPLEO_TRAINING\\src\\hands_on_09\\sugar.txt"));
		String line;

		System.out.println("Date	   Sugar Status");

		while ((line = br.readLine()) != null) {
			String[] data = line.split(" ");
			int sugar = Integer.parseInt(data[1]);

			String status = (sugar >= 90 && sugar <= 110) ? "Normal" : "Up Normal";

			System.out.println(data[0] +" "+ sugar + " 	  " + status);
		}

		br.close();
	}

}
