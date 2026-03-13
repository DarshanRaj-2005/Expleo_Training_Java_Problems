package Java_Basics;
import java.nio.file.Path;
//import java.nio.file.Paths;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
public class FileIO_Example {

	public static void main(String[] args) {
		
		FileSystem fs = FileSystems.getDefault();
		
		//Path p1 = Paths.get("C:\\Users\\dhars\\Documents\\JAVA_EXPLEO_Training\\EXPLEO_TRAINING\\src\\Sample folder");
		Path p1 = fs.getPath("C:\\\\Users\\\\dhars\\\\Documents\\\\JAVA_EXPLEO_Training\\\\EXPLEO_TRAINING\\\\src\\\\Sample folder");
		Path p2 = p1.subpath(1,3);
		
		System.out.println(p1);
		System.out.println(p2);
	}
}
