package Hands_On_01;
import java.util.Scanner;

/*Write a program that reads continuously pairs of grades 
 (exercises and exam grades) and displays the final grade for each student,
  until the user enters a pair of grades containing the value −1.
  Before it ends, the program should display the average grade of
  all students in the course. The program should check that 
  all given grades belong in [0,10]. */

public class Prob_002_Hard {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		double avg = 0;
		double total1 = 0;
		double total2 = 0;
		
		while(true) {
			System.out.println("Enter exercise grade: ");
			int exercise = sc.nextInt();
			System.out.println("Enter exam grade: ");
			int exam = sc.nextInt();
			
			if (exercise == -1 || exam == -1) {
				break;
			}
			else if ((exercise >= 0 && exercise <= 10) && (exam >= 0 && exam <= 10 )) {
				if (exercise >= 5 && exam >= 5) {
					double finalExercise = exercise * 0.30;
					double finalExam = exam * 0.70;
					double result = finalExercise + finalExam;
					System.out.printf("The Final Grade is: %.2f%n", result);
					total1 += result;
				}
				else {
					int result =  Math.min(exam, exercise);
					System.out.println("The Final Grade is: "+ result);
					total2 += result;
				}
				count++;
			}	
		}
		if (count > 0) {
			avg = (total1 + total2) / count;
			System.out.printf("The average of every student: %.2f%n",avg);
		}
		else {
			System.out.println("No student grade entered");
		}
		sc.close();
	}
}
