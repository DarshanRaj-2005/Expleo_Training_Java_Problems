package Java_Basics;

import java.util.Scanner;

public class Basic_Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the name: ");
		String name = sc.nextLine();

		System.out.println("Enter the age: ");
		int age = sc.nextInt();

		if (age > 18) {
			System.out.println(name + " is eligible for voting.");
		} else {
			System.out.println(name + " is not eligible for voting.");
		}
		sc.close();
	}
}
