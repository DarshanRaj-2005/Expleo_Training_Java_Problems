package Java_Basics;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("C:/Users/dhars/Documents/JAVA_EXPLEO_Training/EXPLEO_TRAINING/BasicFile");
			int i = 0;
			try {
				i = fr.read();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			while(i != -1) {
				System.out.print((char)i);
				try {
					i = fr.read();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}

	}

}
