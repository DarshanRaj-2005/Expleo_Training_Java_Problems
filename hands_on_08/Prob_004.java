package hands_on_08;

import java.util.Scanner;

/* Checking debit payment */

class PayOutOfBoundsException extends Exception {
	public PayOutOfBoundsException(String message) {
		super(message);
	}
}

public class Prob_004 {

	double balance = 80000;

	public void checkForDebit(double amount) throws PayOutOfBoundsException {
		if (amount > 30000 && amount < 80000) {
			throw new PayOutOfBoundsException("Maximum transaction limit is 30000");
		}
		if (amount > balance) {
			throw new PayOutOfBoundsException("Insufficient Balance");
		}
	}

	public void withdraw(double amount) {
		balance -= amount;
		System.out.println("Amount successfully withdrawn");
		System.out.println("Balance: " + balance);

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the amount to be debit: ");
		double amount = sc.nextDouble();

		Prob_004 p = new Prob_004();
		try {
			p.checkForDebit(amount);
			p.withdraw(amount);
		} catch (PayOutOfBoundsException e) {
			System.out.println(e);
		}
	}
}
