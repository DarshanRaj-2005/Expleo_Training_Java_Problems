package hands_on_06;

class Customer {
	String name;
	int age;

	Customer(String name, int age) {
		this.name = name;
		this.age = age;
	}

	void displayCustomer() {
		System.out.println("Customer Name: " + name);
		System.out.println("Customer Age: " + age);
	}
}

class Account {
	int accountNumber;
	double balance;

	Account(int accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	void displayAccount() {
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Balance: " + balance);
	}
}

class RBI {
	Customer c;
	Account a;

	RBI(Customer c, Account a) {
		this.c = c;
		this.a = a;
	}

	double getInterestRate() {
		return 4.0;
	}

	double getWithdrawalLimit() {
		return 50000;
	}

	void displayDetails() {
		c.displayCustomer();
		a.displayAccount();
	}
}

class SBI extends RBI {

	SBI(Customer c, Account a) {
		super(c, a);
	}

	@Override
	double getInterestRate() {
		return 5.5;
	}

	@Override
	double getWithdrawalLimit() {
		return 100000;
	}
}

class ICICI extends RBI {

	ICICI(Customer c, Account a) {
		super(c, a);
	}

	@Override
	double getInterestRate() {
		return 6.0;
	}

	@Override
	double getWithdrawalLimit() {
		return 80000;
	}
}

class PNB extends RBI {

	PNB(Customer c, Account a) {
		super(c, a);
	}

	@Override
	double getInterestRate() {
		return 5.0;
	}

	@Override
	double getWithdrawalLimit() {
		return 60000;
	}
}

public class Prob_004 {
	public static void main(String[] args) {

		Customer cust = new Customer("Darshan", 21);
		Account acc = new Account(12345, 50000);

		RBI bank;

		System.out.println("----- SBI Bank -----");
		bank = new SBI(cust, acc);
		bank.displayDetails();
		System.out.println("Interest Rate: " + bank.getInterestRate());
		System.out.println("Withdrawal Limit: " + bank.getWithdrawalLimit());

		System.out.println("\n----- ICICI Bank -----");
		bank = new ICICI(cust, acc);
		bank.displayDetails();
		System.out.println("Interest Rate: " + bank.getInterestRate());
		System.out.println("Withdrawal Limit: " + bank.getWithdrawalLimit());

		System.out.println("\n----- PNB Bank -----");
		bank = new PNB(cust, acc);
		bank.displayDetails();
		System.out.println("Interest Rate: " + bank.getInterestRate());
		System.out.println("Withdrawal Limit: " + bank.getWithdrawalLimit());
	}
}
