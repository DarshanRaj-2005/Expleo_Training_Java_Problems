package hands_on_07;

import java.util.Scanner;

public class Prob_003 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Mail Id:");

		String mail = sc.next();
		int atCount = 0;
		boolean isLocal = true;

		for (int i = 0; i < mail.length(); i++) {
			if (mail.charAt(i) == '@') {
				atCount++;
			}
		}

		if (atCount == 1) {

			String arr[] = mail.split("@");

			if (arr[0].length() > 0 && Character.isLetter(arr[0].charAt(0))) {
				isLocal = true;
			} else {
				System.out.println("First Letter should be Character");
				isLocal = false;
			}

			for (int i = 1; i < arr[0].length() - 1; i++) {
				if (!Character.isLetterOrDigit(arr[0].charAt(i)) && !Character.isLetterOrDigit(arr[0].charAt(i + 1))) {
					System.out.println("Email should not have Consecutive Symbol");
					isLocal = false;
					break;
				}
			}

			if (arr[0].length() > 0 && !Character.isLetterOrDigit(arr[0].charAt(arr[0].length() - 1))) {
				System.out.println("Before @ should not be Symbol");
				isLocal = false;
			}

			if (isLocal) {

				if (arr[1].contains(".")) {
					if (!(Character.isLetterOrDigit(arr[1].charAt(0)))
							&& Character.isLetterOrDigit(arr[1].charAt(arr[1].length() - 1))) {
						System.out.println("Starting and ending of domain should be Letter or Digit");
						isLocal = false;
					}

					for (int i = 0; i < arr[1].length() - 1; i++) {
						if (!Character.isLetterOrDigit(arr[1].charAt(i))
								&& !Character.isLetterOrDigit(arr[1].charAt(i + 1))) {
							System.out.println("Domain should have a letter or digit after '.'");
							isLocal = false;
							break;
						}
					}
				} else {
					System.out.println("Domain should contain '.'");
					isLocal = false;
				}
			}
		}

		else {
			System.out.println("Mail should contain only one @");
			isLocal = false;
		}

		if (isLocal) {
			System.out.println("Your Email is Valid");
		}
		sc.close();
	}
}
