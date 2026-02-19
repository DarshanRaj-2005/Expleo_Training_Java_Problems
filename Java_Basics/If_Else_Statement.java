package Java_Basics;
import java.util.Scanner;

public class If_Else_Statement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean isMoving = true;
		System.out.println("Enter the speed of the vechicle:");
		int speed = sc.nextInt();
		
		/*If Block will be executed if the condition is true otherwise
		the else block will be executed*/
		if (isMoving) {
			speed--;
			System.out.println("The Reduced speed of the vehichle: "+speed);
		}
		else {
			System.out.println("The vehicle is already stopped");
		}
		
		sc.close();
	}
}
