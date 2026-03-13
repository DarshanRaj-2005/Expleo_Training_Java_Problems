package Java_Basics;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedStream {

	public static void main(String[] args) {
		
		try(BufferedReader bi = new BufferedReader(new FileReader("BufferStream.txt"));
			BufferedWriter bw = new BufferedWriter(new FileWriter("Output.txt"))){ 
			String line = "";
			while((line = bi.readLine()) != null) {
				bw.write(line);
				bw.newLine();
			}
		}catch(FileNotFoundException f) {
			System.out.println(f.getMessage());
		}
		catch(IOException i) {
			System.out.println(i);
		}
	}
}
