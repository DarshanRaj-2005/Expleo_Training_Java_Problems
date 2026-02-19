package Hands_On_03;
import java.util.*;

// Write a program to print all prime numbers in the interval [x,y] 

public class Prob_002_Medium {
	
	static void calculatePrimeInRange(int start,int end) {
		
		if (start > end) {
			System.out.println("Provide Valid Input");
		}
		for(int i = start;i <= end;i++) {
			int flag = 0;
			for(int j = 2;j <= i/2;j++) {
				if(i % j == 0) {
					flag = 1;
				}
			}
			if (flag == 0) {
				System.out.print(i+" ");
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter start value:");
		int startValue = sc.nextInt();
		
		System.out.println("Enter end value:");
		int endValue = sc.nextInt();
		
		calculatePrimeInRange(startValue,endValue);
	}

}
