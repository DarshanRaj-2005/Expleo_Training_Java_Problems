package hands_on_10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*Write a program that asks how many names the user wants to input, asks for those 
names, and shows the names afterward. But it should only show names that are 
longer than 5 characters using Array List */
public class Prob_001 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<String> nameList = new ArrayList<>();

		System.out.println("How many names do you want to input?");
		int count = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < count; i++) {
			nameList.add(sc.nextLine());
		}

		for (String li : nameList) {
			if (li.length() > 5) {
				System.out.println(li);
			}
		}
		sc.close();
	}
}
