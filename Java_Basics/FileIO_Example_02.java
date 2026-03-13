package Java_Basics;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.FileSystem;

public class FileIO_Example_02 {

	public static void main(String[] args) {
		
		FileSystem fs = FileSystems.getDefault();
		
		Path p1 = fs.getPath("C:\\Users\\dhars\\Documents\\JAVA_EXPLEO_Training\\..\\src\\Sample folder\\New Text Document.txt");
		Path normalizePath = p1.normalize();
		
		Path p2 = fs.getPath("C:\\Users\\dhars\\Documents\\JAVA_EXPLEO_Training\\EXPLEO_TRAINING\\src\\Sample folder");
		System.out.println("Normalized path: "+normalizePath);
		
		Path subPath = p1.subpath(1, 6);
		System.out.println("Sub Path: "+subPath);
		
		System.out.println("File Name: "+p1.getFileName());
		System.out.println("Get Parent: "+p1.getParent());
		System.out.println("Get Root: "+p1.getRoot());
		System.out.println("Get Name Count: "+p1.getNameCount());
		System.out.println("isAbsolute: "+p1.isAbsolute());
		System.out.println("To Absolute Path: "+p1.toAbsolutePath());
		System.out.println("to URI: "+p1.toUri());
		
		if(p1.equals(p2)) {
			System.out.println("Both are equal");
		}
		else {
			System.out.println("Both are not equal");
		}
	}
}
