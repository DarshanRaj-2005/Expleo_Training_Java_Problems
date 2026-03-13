package Java_Basics;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;
import java.nio.file.Files;
public class SymbolicLInk_Using_SoftLink {

	public static void main(String[] args) {
		
		Path existingFilePath = Paths.get("C:\\Users\\dhars\\Documents\\JAVA_EXPLEO_Training\\EXPLEO_TRAINING\\src\\Sample folder");
		Path symLinkPath = Paths.get("F:\\Test_Link.txt");
		
		Boolean result = Files.exists(existingFilePath);
		System.out.println("isFileExist: "+result);
		
		try {
			Files.createSymbolicLink(symLinkPath,existingFilePath);
		}
		catch (IOException e) {
			System.err.println(e);
		}
		catch (UnsupportedOperationException e) {
			System.err.println(e);
		}
	}

}
