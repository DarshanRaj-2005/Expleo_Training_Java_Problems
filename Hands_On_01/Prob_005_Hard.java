package Hands_On_01;
import java.util.Scanner;

/*If the input is less than or equal to zero, the output should be “Invalid Input”.
  Also, if the input provided is not exactly the factorial of a number,
  say, the input provided is 122, which is not a perfect factorial of a number;
  it should return “Sorry. The given number is not a perfect factorial*/

public class Prob_005_Hard {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value: ");
	    int value = sc.nextInt();
	    int sum = 1;
	    int i = 1;

	    if (value > 0) {
	    	while(sum < value) {
	    		sum *= i;
	    		i++;
	    	}
	    	if (sum == value) {
	    		System.out.println(i-1);
	    	}
	    	else {
	    		System.out.print("Sorry. The given number is not a perfect factorial");
	    	}
	    }
	    else {
	    	System.out.print("Invalid Input");
	    }
		sc.close();
	}
}
