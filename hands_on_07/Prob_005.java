package hands_on_07;

import java.util.Scanner;
import java.util.Random;

/*Input Example 
User=Richard; Password=ricadmin@123; IP=192.168.1.1; Status=SUCCESS
Expected Output 
User=Richard; Password=************; IP=xxx.xxx.xxx.xxx; Status=SUCCESS */

public class Prob_005 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random randomNum = new Random();

		System.out.println("Enter a Username:");
		String userName = sc.nextLine();
		System.out.println("Enter a Password:");
		String password = sc.nextLine();
		System.out.println("Enter a IP Address:");
		String ipAddress = sc.nextLine();
		System.out.println("Enter a status:");
		String status = sc.nextLine();

		int random = randomNum.nextInt(6) + 5;
		String newPassword = "";
		for (int i = 0; i < random; i++) {
			newPassword += "*";
		}
		password = newPassword;
		
		String arr[] = ipAddress.split("\\.");
		
		for (int i=0;i<arr.length;i++) {
			arr[i] = "xxx";
		}
		ipAddress = String.join(".",arr);
		
		System.out.println("Details: ");
		System.out.println("--------------");
		System.out.println("User: " + userName);
		System.out.println("Password: " + password);
		System.out.println("IP Address: " + ipAddress);
		System.out.println("Status: " + status);
		sc.close();
	}
}
