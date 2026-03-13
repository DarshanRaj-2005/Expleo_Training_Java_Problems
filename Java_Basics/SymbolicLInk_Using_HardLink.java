package Java_Basics;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.nio.file.Files;
public class SymbolicLInk_Using_HardLink {

	public static void main(String[] args) {
		try {
			Path existingFilePath = Paths.get("F:\\Personal\\Training\\Example\\Symbolic_Link\\Test.txt");
			Path hardLinkPath = Paths.get("F:\\Test_link.txt");
			Files.createLink(hardLinkPath, existingFilePath);
		} catch (Exception ex) {
			System.out.println(ex); 
		}
	}
}
