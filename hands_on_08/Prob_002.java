package hands_on_08;
import java.util.Scanner;

/*To Check username and password */

class InvalidUsernameException extends Exception {
	public InvalidUsernameException(String message) {
		super(message);
	}
}

class InvalidPasswordException extends Exception {
	public InvalidPasswordException(String message) {
		super(message);
	}
}
public class Prob_002 {
	
	public String getMessage(String username, String password) throws InvalidUsernameException, InvalidPasswordException  {
		
		String storedUsername = "Darshan_12";
		String storedPassword = "Darshan@123";
		
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
		
		boolean digit = false;
		boolean upCase = false;
		boolean lowCase = false;
		boolean symbol = false;
		
		String sp="!@#$%^&*()-+";
		
		for(int i=0;i<password.length();i++) {
			
			char ch = password.charAt(i);
			
			if(Character.isDigit(ch)) {
				digit = true;
			}
			if(Character.isUpperCase(ch)) {
				upCase = true;
			}
			if(Character.isLowerCase(ch)) {
				lowCase = true;
			}
			if(sp.contains(String.valueOf(ch))) {
				symbol = true;
			}
		}
		
		if(password.length() >= 8 || !digit ||
				!lowCase || !upCase|| !symbol) {
			throw new InvalidPasswordException("Invalid Password");
		}
		
		
		if (username.equals(storedUsername) && password.equals(storedPassword)) {
			return "Welcome "+username ;
		}
		else {
			return "Invalid username or password";
		}
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
