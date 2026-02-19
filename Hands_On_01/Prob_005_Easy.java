package Hands_On_01;

/*Program using for loop to print alphabets as follows: 
az by cx dw ev fu gt hs ir jq kp lo mn nm ol pk qj ri 
sh tg uf ve wd xc yb za*/

public class Prob_005_Easy {

	public static void main(String[] args) {
		int fromBegin = 97;
		int fromEnd = 122;

		for (int i = 1; i <= 26; i++) {
			System.out.print((char) fromBegin);
			System.out.print((char) fromEnd + " ");
			fromBegin++;
			fromEnd--;
		}
	}
}
