package hands_on_05;

import java.util.*;

/*Employee Payroll Management System */

abstract class Payment {
	private String transactionId;
	private double amount;
	private String customerName;
	private String paymentStatus;

	Payment(String transactionId, double amount, String customerName) {

		this.transactionId = transactionId;
		this.amount = amount;
		this.customerName = customerName;
		this.paymentStatus = "pending";
	}

	public void executeTransaction() {
		if (validatePayment()) {
			if (processPayment()) {
				setPaymentStatus("Success");
			} else {
				setPaymentStatus("Failed");
			}
		} else {
			setPaymentStatus("Validation Failed");
		}
		generateReceipt();
	}

	public void generateReceipt() {
		System.out.println();
		System.out.println("Payment Receipt");
		System.out.println("--------------------------");
		System.out.println();
		System.out.println("Transaction Id: " + transactionId);
		System.out.println("Amount: " + amount);
		System.out.println("Customer Name: " + customerName);
		System.out.println("Payment Status: " + paymentStatus);
		System.out.println();
		System.out.println("--------------------------");
	}

	public String getTransactionId() {
		return transactionId;
	}

	public double getAmount() {
		return amount;
	}

	public void setPaymentStatus(String status) {
		paymentStatus = status;
	}

	public String getPaymentStatus() {
		return paymentStatus;
	}

	public abstract boolean validatePayment();

	public abstract boolean processPayment();

}

class CreditCardPayment extends Payment {
	private String cardNumber;
	private String cvv;
	private String expiryDate;

	CreditCardPayment(String transactionId, double amount, String customerName, String cardNumber, String cvv,
			String expiryDate) {
		super(transactionId, amount, customerName);
		this.cardNumber = cardNumber;
		this.cvv = cvv;
		this.expiryDate = expiryDate;
	}

	public boolean validatePayment() {
		if (cardNumber.length() != 19) {
			return false;
		}
		if (cardNumber.charAt(4) != ' ' || cardNumber.charAt(9) != ' ' 
			|| cardNumber.charAt(14) != ' ') {
			return false;
		}
		if (cvv.length() != 3) {
			return false;
		}
		if (expiryDate.length() != 5 || expiryDate.charAt(2) != '/') {
			return false;
		}
        int month = Integer.parseInt(expiryDate.substring(0, 2));
        int year = Integer.parseInt(expiryDate.substring(3, 5));
	    if (month < 1 || month > 12) {
			return false;
		}
	    
	    if (year < 26 || year > 99) {
	    	return false;
	    }
		return true;
	}

	public boolean processPayment() {
		System.out.println();
		System.out.println("Credit Card Validated Sucessfully.");
		System.out.println("Processing Payment....");
		return true;
	}
}

class UPIPayment extends Payment {

	private String upiId;
	private String upiPin;

	UPIPayment(String transactionId, double amount, String customerName, String upiId, String upiPin) {
		super(transactionId, amount, customerName);
		this.upiId = upiId;
		this.upiPin = upiPin;
	}

	public boolean validatePayment() {
		if (!upiId.contains("@")) {
			return false;
		}
		if (upiPin.length() != 4) {
			return false;
		}
		return true;
	}

	public boolean processPayment() {
		System.out.println();
		System.out.println("UPI request Approved.");
		System.out.println("Processing Payment.....");
		return true;
	}
}

class NetBankingPayment extends Payment {
	// private String bankName;
	private String accountNumber;
	private String ifscCode;

	NetBankingPayment(String transactionId, double amount, String customerName, String bankName, String accountNumber,
			String ifscCode) {
		super(transactionId, amount, customerName);
		this.accountNumber = accountNumber;
		this.ifscCode = ifscCode;
		// this.bankName = bankName;
	}

	public boolean validatePayment() {
		if (accountNumber.length() != 9) {
			return false;
		}
		if (ifscCode.length() != 11 || ifscCode.charAt(4) != 0) {
			return false;
		}
		return true;
	}

	public boolean processPayment() {
		System.out.println();
		System.out.println("NetBanking Validation Successful.");
		System.out.println("Processing Payment.....");
		return true;
	}
}

public class Prob_002 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Payment p;

		while (true) {
			System.out.println("1. Credit Card Payment");
			System.out.println("2. UPI Payment");
			System.out.println("3. Net Banking Payment");
			System.out.println("Enter the choice");

			int choice = sc.nextInt();
			sc.nextLine();

			if (choice == 1) {
				System.out.println("Enter Transaction Id:");
				String transactionId = sc.nextLine();

				System.out.println("Enter Amount:");
				double amount = sc.nextDouble();

				sc.nextLine();

				System.out.println("Enter Name:");
				String name = sc.nextLine();

				System.out.println("Enter Card Number" + "(format: 1234 5678 1234 5678):");
				String cardNumber = sc.nextLine();

				System.out.println("Enter CVV Number:");
				String cvv = sc.nextLine();

				System.out.println("Enter Expiry Date" + "(Format:MM/YY):");
				String expiryDate = sc.nextLine();

				p = new CreditCardPayment(transactionId, amount, name, cardNumber, cvv, expiryDate);
				p.executeTransaction();
			}

			else if (choice == 2) {
				System.out.println("Enter Transaction Id:");
				String transactionId = sc.nextLine();

				System.out.println("Enter Amount:");
				double amount = sc.nextDouble();

				sc.nextLine();

				System.out.println("Enter Name:");
				String name = sc.nextLine();

				System.out.println("Enter UPI Id" + "(Format:user@sbi):");
				String upiId = sc.nextLine();

				System.out.println("Enter UPI Pin(Four Digit):");
				String upiPin = sc.nextLine();

				p = new UPIPayment(transactionId, amount, name, upiId, upiPin);
				p.executeTransaction();
			}

			else if (choice == 3) {
				System.out.println("Enter Transaction Id:");
				String transactionId = sc.nextLine();

				System.out.println("Enter Amount:");
				double amount = sc.nextDouble();

				sc.nextLine();

				System.out.println("Enter Name:");
				String name = sc.nextLine();

				System.out.println("Enter Bank Name");
				String bankName = sc.nextLine();

				System.out.println("Enter Account Number(Nine Digit):");
				String accountNumber = sc.nextLine();

				System.out.println("Enter IFSC Code" + "(Format:sbin0001234):");
				String ifscCode = sc.nextLine();

				p = new NetBankingPayment(transactionId, amount, name, bankName, accountNumber, ifscCode);
				p.executeTransaction();
			} else if (choice == 4) {
				System.out.println("Exited..");
				break;
			}
		}
		sc.close();
	}
}
