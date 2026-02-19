package Hands_On_02;
import java.util.Random;

// Roll the dice 100 times and display the frequency of each number rolled using arrays.

public class Prob_002_Medium {

	public static void main(String[] args) {
		int[] frequency = new int[6];
		Random random = new Random();

		for (int i = 0; i < 100; i++) {
			int roll = random.nextInt(6) + 1;
			frequency[roll - 1]++;
		}

		System.out.println("Dice roll frequencies after 100 rolls:");
		for (int i = 0; i < frequency.length; i++) {
			System.out.println((i + 1) + " =>  " + frequency[i]);
		}
	}

}
