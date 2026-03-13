package hands_on_08;
import java.util.Scanner;

class InvalidUsernameException extends Exception {
	public InvalidUsernameException(String message) {
		super(message);
	}
}
public class Prob_002 {
	
	public String getMessage(String username, String password) throws InvalidUsernameException  {
		
		if (username.length() < 6 || username.length() > 30) {
			throw new InvalidUsernameException("Invalid Username");
		}
		
		for (int i=0;i<username.length();i++) {
			if (!Character.isLetterOrDigit(username.charAt(i)) && username.charAt(i) != '_') {
				throw new InvalidUsernameException("Invalid Username");
			}
		}
		
		if (!Character.isLetter(username.charAt(0))) {
			throw new InvalidUsernameException("Invalid Username");
		}
				return "Welcome "+username ;
}
		
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a username:");
		String username = sc.nextLine();
		
		System.out.println("Enter a password:");
		String password = sc.next();
		
		Prob_002 s1 = new Prob_002();
		try {
			System.out.println(s1.getMessage(username,password));
		}
		catch(Exception e) {
			System.out.println(e);
		}
		sc.close();
	}
}
