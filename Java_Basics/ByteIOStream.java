package Java_Basics;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class ByteIOStream {

	public static void main(String[] args) {
		
		byte[] b = new byte[128];
		
		try(FileInputStream fis = new FileInputStream("Input_Output_Stream.txt");
				FileOutputStream fos = new FileOutputStream("Output.txt")){
			System.out.println("Bytes Available: "+fis.available());
			int count = 0 ; int read = 0;
			while((read = fis.read(b)) != -1) {
				fos.write(b);
				fos.close();
			}
			System.out.println("Total Count "+count);	
				}catch(FileNotFoundException f) {
					System.out.println(f);
				}
		catch(IOException i) {
			System.out.println(i);
		}
	}
}
