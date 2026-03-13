package Java_Basics;
import java.io.FileOutputStream;
public class FilesOutputStream {

	public static void main(String[] args) {
		
		String data = "Welcome to Java Portal!! Have a Happy Learning";
		
		try {
			FileOutputStream fo = new FileOutputStream("Output.txt");
			
			byte array[] = data.getBytes();
			fo.write(array);
			fo.close();
		} catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}
