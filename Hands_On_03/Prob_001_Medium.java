package Hands_On_03;
import java.util.*;

//Find difference between the sum of odd and even numbers

public class Prob_001_Medium {
	
	static void calculateDifference(int lowerBound, int higherBound) {
		int oddSum = 0;
		int evenSum = 0;
		for (int i = lowerBound; i <= higherBound;i++) {
			if (i % 2 == 0) {
				evenSum += i;
			}
			else {
				oddSum += i;
			}
		}
		System.out.println("Odd Sum:"+oddSum);
		System.out.println("Even Sum:"+evenSum);
		System.out.println("The Diffrence:"+
		Math.abs(oddSum - evenSum));

	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter LowerBound Value: ");
		int lowerBound = sc.nextInt();
		
		System.out.println("Enter higherBound Value: ");
		int higherBound = sc.nextInt();
	
		calculateDifference(lowerBound,higherBound);
	}

}
