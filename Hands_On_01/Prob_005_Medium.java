package Hands_On_01;

import java.util.Scanner;

/*Write a program that reads continuously a month number 
 (1 = Jan, 12 = Dec), the day that the month begins 
 (1 = Mon, 7 = Sun), and displays the calendar for
  that month*/

public class Prob_005_Medium {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter month number : ");
		int month = sc.nextInt();

		System.out.print("Enter start date : ");
		int startDate = sc.nextInt();
		int endDate;

		int count = 0;

		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			endDate = 31;
		} else if (month == 2) {
			System.out.print("Enter the end date : ");
			endDate = sc.nextInt();
		} else {
			endDate = 30;
		}

		switch (month) {
		case 1:
			System.out.println("		 January");
			break;
		case 2:
			System.out.println("		 February");
			break;
		case 3:
			System.out.println("		 March");
			break;
		case 4:
			System.out.println("		 April");
			break;
		case 5:
			System.out.println("		 May");
			break;
		case 6:
			System.out.println("		 June");
			break;
		case 7:
			System.out.println("		 July");
			break;
		case 8:
			System.out.println("		 August");
			break;
		case 9:
			System.out.println("		 September");
			break;
		case 10:
			System.out.println("		 October");
			break;
		case 11:
			System.out.println("		 November");
			break;
		case 12:
			System.out.println("		 December");
			break;
		default:
			System.out.println("Not a valid month number");
			break;
		}

		for (int i = startDate; i <= endDate; i++) {
			if (count == 7) {
				System.out.println();
				count = 0;
			}
			System.out.print(i + "	");
			count++;
		}

		sc.close();

	}

}