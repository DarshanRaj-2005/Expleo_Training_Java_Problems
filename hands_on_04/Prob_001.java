package hands_on_04;
import java.util.*;

//Account Management System

class Account {
	private String id;
	private String name;
	private int balance = 0;
	
	Account(String id, String name){
		this.id = id;
		this.name = name; 
	}
	
	Account(String id, String name,int balance){
		this.id = id;
		this.name = name; 
		this.balance = balance;
	}
	
	public String getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	public int getBalance() {
		return balance;
	}
	public int credit(int amount) {
		balance += amount;
		return balance;
	}
	public int debit(int amount) {
		if (amount < balance || amount == balance) {
			balance -= amount;
		}
		else {
			System.out.println("Amount exceeded balance");
		}
		return balance;
	}
	
	public int TransferTo(Account another,int amount) {
		if (amount < balance || amount == balance) {
			this.balance -= amount;
			another.balance += amount;
		}
		else {
			System.out.println("Amount exceeded balance");
		}
		return this.balance;
	}
}

public class Prob_001 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Account a1 = null;
		Account a2 = new Account("AC001","Jaggu");
		int accountType = 0;
		
		do {
			System.out.println("1.Account Creation without Initial Balance");
			System.out.println("2.Account Creation with Initial Balance");
			System.out.println("3.Credit Amount");
			System.out.println("4.Debit Amount");
			System.out.println("5.Fund Transfer");
			System.out.println("6.Display Account Detials");
			System.out.println("7.Exit");
			
			int action = sc.nextInt();
			
			if (action == 1) {
				System.out.println("Enter Account No:");
				String id = sc.next();
				
				sc.nextLine();
				
				System.out.println("Enter Name:");
				String name = sc.nextLine();
				
				a1 = new Account(id,name);
				accountType = 1;
				
				System.out.println("Account Successfully Created");
			}
			else if (action == 2) {
				System.out.println("Enter Account No:");
				String id = sc.next();
				
				sc.nextLine();
				
				System.out.println("Enter Account Holder Name:");
				String name = sc.nextLine();
				
				System.out.println("Enter Balance:");
				int balance = sc.nextInt();
				
				a1 = new Account(id,name,balance);
				accountType = 2;
				
				System.out.println("Account Successfully Created");
			}
			else if (action == 3) {
				if (a1 != null) {
					System.out.println("Enter the Amount to be Credited:");
					int amount = sc.nextInt();
					
					a1.credit(amount);
				}
				else {
					System.out.println("Create an Account First");
				}
			}
			else if (action == 4) {
				if (a1 != null) {
					System.out.println("Enter the Amount to be Debited:");
					int account = sc.nextInt();
					
					a1.debit(account);;
				}
				else {
					System.out.println("Create an Account First");
				}
			}
			else if (action == 5) {
				if (a1 != null && a2 != null) {
					System.out.println("Enter the Account Number the amount to be Transfered:");
					String id = sc.nextLine();
					sc.nextLine();
					System.out.println("Enter the Amount to be Transfered:");
					int amount = sc.nextInt();
					
					a1.TransferTo(a2, amount);
				}
				else {
					System.out.println("Accounts should be Created");
				}
			}
			else if (action == 6) {
				if (a1 != null) {
					System.out.println("---------------------");
					System.out.println("ID: "+a1.getId());
					System.out.println("NAME: "+a1.getName());
					
					if (accountType == 1) {
						System.out.println("BALANCE: 0");
					}
					
					if (accountType == 2) {
						System.out.println("BALANCE: "+a1.getBalance());
					}
					
					System.out.println("---------------------");
					System.out.println();
				}
				else {
					System.out.println("Still Account Not Created");
				}
			}
			else if (action == 7) {
				System.out.println("Exited...");
				break;
			}
		}while(true);	
		sc.close();
	}
}
