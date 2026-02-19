package Java_Basics;

public class Switch_Statement {

	public static void main(String[] args) {
		
		//integer type is supported here because it was because of java Unicode concept
		int letter = 'A';
		
		switch(letter) {
		case 'a':
			System.out.println("Lowercase");
			break;
			
		case 'A':
			System.out.println("Uppercase");
			break;
			
		default:
			System.out.println("Enter valid input");
			break;
		}
	}
}
