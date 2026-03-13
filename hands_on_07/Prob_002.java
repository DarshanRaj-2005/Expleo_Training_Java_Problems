package hands_on_07;
import java.util.Scanner;

/*Sample Input: 
"   Welcome to Java   " 
Sample Output: 
"Welcome to Java"*/

public class Prob_002 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String:");
		String s1 = sc.nextLine();
		int startCount = 0;
		int endCount = s1.length();
		
		for (int i = 0;i<s1.length();i++) {
			if(s1.charAt(i) == ' ') {
				startCount++;
			}
			else {
				break;
			}
		}
		
		for (int i = s1.length()-1;i>= 0;i--) {
			if(s1.charAt(i) == ' ') {
				endCount--;
			}
			else {
				break;
			}
		}
		System.out.print(s1.substring(startCount,endCount));
		sc.close();
	}
}
