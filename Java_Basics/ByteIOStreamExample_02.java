package Java_Basics;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;

public class ByteIOStreamExample_02 {

	public static void main(String[] args) {
		
		char[] b = new char[128];
		try(FileReader fr = new FileReader("FileReaderWriter.txt");
				FileWriter fw = new FileWriter("Output.txt")) {
			int count = 0; int read = 0;
			
			while((read = fr.read(b)) != -1) {
				fw.write(b);
				count += read;
			}
			System.out.println("Total Count: "+count);
		}catch(FileNotFoundException f) {
			System.out.println(f);
		}
		catch(IOException i) {
			System.out.println(i);
		}
	}
}
