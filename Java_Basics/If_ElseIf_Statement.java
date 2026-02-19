package Java_Basics;
import java.util.Scanner;
public class If_ElseIf_Statement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Seat Type: (Regular/Premium/VIP)");
		String seatType = sc.nextLine();
		
		/*If is true if will be executed otherwise
		 * Else if will be checked and if it is true it will be executed otherise
		 * else block will be executed*/
		
		if (seatType.equals("Regular")) {
			System.out.println("Your Regular Seat rate is $2.5");
		}
		else if (seatType.equals("Premium")) {
			System.out.println("Your Premium Seat rate is $4.5");
		}
		else if (seatType.equals("VIP")){
		System.out.println("Your VIP Seat rate is $7");
		}
		else {
			System.out.println("Enter the correct seat type");
		}
		sc.close();
	}
}
