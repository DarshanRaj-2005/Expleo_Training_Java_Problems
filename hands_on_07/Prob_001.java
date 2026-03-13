package hands_on_07;
import java.util.Scanner;

/*Sample Input: 
corporate assignment 
Sample Output: 
corpte asingm */

public class Prob_001 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String:");
		String s1 = sc.nextLine();
		String s2 = "";
		
		for(int i=0;i<s1.length();i++) {
			if (s2.contains(String.valueOf(s1.charAt(i)))){
				continue;
			}
			else {
				s2 += s1.charAt(i);
			}
		}
		System.out.print(s2);
		sc.close();
	}
}
