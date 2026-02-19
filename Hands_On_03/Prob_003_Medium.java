package Hands_On_03;

import java.util.Scanner;

public class Prob_003_Medium {

	public static int calculateOvertimePay(int hoursWorked) {
		int normalHours = 40;
		int overtimeRate = 15;

		if (hoursWorked > normalHours) {
			int overtimeHours = hoursWorked - normalHours;
			return overtimeHours * overtimeRate;
		} else {
			return 0;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for (int i = 1; i <= 5; i++) {
			System.out.print("Enter hours worked by employee " + i + ": ");
			int hoursWorked = sc.nextInt();

			int overtimePay = calculateOvertimePay(hoursWorked);

			System.out.println("Overtime pay for employee " + i + ": Rs." + overtimePay);
			System.out.println();
		}

		sc.close();
	}
}
