package Java_Basics;
import java.util.Scanner;

public class ReadUserInput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your Roll no: ");
		int rollNo = sc.nextInt();
		
		/*We using sc.nextLine for writing string after declaring integer,
		because after integer it won't move it nextLine*/
		sc.nextLine();
		
		System.out.println("Enter your Name: ");
		String name = sc.nextLine();
		
		System.out.println("Enter your age: ");
		int age = sc.nextInt();
		
		System.out.println("\nStudent Detials: ");
		System.out.println("---------------------");
		System.out.println("Roll No :"+rollNo);
		System.out.println("Name :"+name);
		System.out.println("Age :"+age);
		
		sc.close();
	}
}
