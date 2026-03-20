package hands_on_10;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Prob_003 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the text: ");
		String text = sc.nextLine();
		text = text.toLowerCase();

		char[] chars = { 'a', 'c', 'o', 's' };

		Map<Character, Integer> map = new HashMap<>();

		for (char ch : chars) {
			map.put(ch, 0);
		}

		for (char ch : text.toCharArray()) {
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			}
		}
		System.out.println("Character counts:");
		for (char ch : chars) {
			System.out.println(ch + ": " + map.get(ch));
		}
		sc.close();
	}

}
