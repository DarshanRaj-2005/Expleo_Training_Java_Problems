package hands_on_07;
import java.util.Scanner;

/*Alphabet characters (A–Z, a–z) 
o Shift each alphabet by +3 positions (Caesar shift). 
o Preserve the original case (uppercase stays uppercase; lowercase stays 
lowercase).
 Digits (0–9) 
o Keep digits unchanged. 
3. Spaces 
o Replace each space with an underscore (_). 
4. All other characters 
o Copy them as-is
*/

public class Prob_004 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String:");
		String s1 = sc.nextLine();
		String s2 = "";
		
		for(int i=0;i<s1.length();i++) {
			char c = s1.charAt(i);
			if (c >= 'A' && c <= 'W' || c >= 'a' && c <= 'w') {
				c += 3;
				s2 += c;
			}
			else if (c >= 'X' && c <= 'Z' || c >= 'x' && c <= 'z') {
				c += 3;
				c -= 26;
				s2 += c;
			}
			else if (c == ' ') {
				c = '_';
				s2+=c;
			}
			else if (c >= '0' && c <= '9') {
				s2 += c;
			}
			else {
				s2 += c;
			}
		}
		System.out.println(s2);
		sc.close();
	}
}
