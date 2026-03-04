package hands_on_05;

import java.util.*;

//Employee Payroll Management System

class Employee {
	String empId;
	String empName;
	double baseSalary;

	Employee(String empId, String empName, double baseSalary) {
		this.empId = empId;
		this.empName = empName;
		this.baseSalary = baseSalary;
	}

	public String getEmpId() {
		return empId;
	}

	public String getEmpName() {
		return empName;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public double calculateSalary() {
		return baseSalary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", baseSalary=" + baseSalary + "]";
	}
	
}

class PermanentEmployee extends Employee {
	double bonus;

	PermanentEmployee(String empId, String empName, double baseSalary, double bonus) {
		super(empId, empName, baseSalary);
		this.bonus = bonus;
	}

	@Override
	public double calculateSalary() {
		return baseSalary + bonus;
	}

	@Override
	public String toString() {
		return "PermanentEmployee [bonus=" + bonus + ", empId=" + empId + ", empName=" + empName + ", baseSalary="
				+ baseSalary + "]";
	}
}

class ContractEmployee extends Employee {
	double taxRate;
	double serviceCharge;

	ContractEmployee(String empId, String empName, double baseSalary, double taxRate, double serviceCharge) {
		super(empId, empName, baseSalary);
		this.taxRate = taxRate;
		this.serviceCharge = serviceCharge;
	}

	@Override
	public double calculateSalary() {
		return baseSalary - (baseSalary * taxRate) - serviceCharge;
	}

	@Override
	public String toString() {
		return "ContractEmployee [taxRate=" + taxRate * 100 + ", serviceCharge=" + serviceCharge + ", empId=" + empId
				+ ", empName=" + empName + ", baseSalary=" + baseSalary + "]";
	}
}

class Intern extends Employee {
	double stipend;

	Intern(String empId, String empName, double stipend) {
		super(empId, empName, stipend);
		this.stipend = stipend;
	}

	@Override
	public double calculateSalary() {
		return stipend;
	}

	@Override
	public String toString() {
		return "Intern [stipend=" + stipend + ", empId=" + empId + ", empName=" + empName + "]";
	}
}

public class Prob_001 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Employee e = null;
		
		while (true) {
			System.out.println("1. Add Permanent Employee");
			System.out.println("2. Add Contract Employee");
			System.out.println("3. Add Intern Employee");
			System.out.println("4. List Employee detials");
			System.out.println("5. Calculate Salary of the Employee");
			System.out.println("6. Exit");
			System.out.println("Enter your Choice:");
			int choice = sc.nextInt();

			if (choice == 1) {
				System.out.println("Enter Employee Id: ");
				String id = sc.next();
				sc.nextLine();
				System.out.println("Enter Employee Name:");
				String name = sc.nextLine();
				System.out.println("Enter Employee Base Salary:");
				double baseSal = sc.nextDouble();
				System.out.println("Enter Employee Bonus:");
				double bonus = sc.nextDouble();
				
				e = new PermanentEmployee(id,name,baseSal,bonus);
				System.out.println("Permanent Employee added Successfully");

			} else if (choice == 2) {
				System.out.println("Enter Employee Id: ");
				String id = sc.next();
				sc.nextLine();
				System.out.println("Enter Employee Name:");
				String name = sc.nextLine();
				System.out.println("Enter Employee Base Salary:");
				double baseSal = sc.nextDouble();
				System.out.println("Enter Tax Rate(0.10 for 10%):");
				double taxrate = sc.nextDouble();
				System.out.println("Enter Service Charge:");
				double service = sc.nextDouble();
				
				e = new ContractEmployee(id,name,baseSal,taxrate,service);
				System.out.println("Contract Employee added Successfully");
				
			} else if (choice == 3) {
				System.out.println("Enter Employee Id: ");
				String id = sc.next();
				sc.nextLine();
				System.out.println("Enter Employee Name:");
				String name = sc.nextLine();
				System.out.println("Enter Stipend:");
				double stipend = sc.nextDouble();
				
				e = new Intern(id,name,stipend);
				System.out.println("Intern Employee added Successfully");
				
			} else if (choice == 4) {	
				if (e != null) {
					System.out.println("-------------------------");
					System.out.println(e.toString());
					System.out.println("-------------------------");
				}
				else {
					System.out.println("Employee Detials are null");
				}
				
			} else if (choice == 5) {
				System.out.println("Enter Employee Id:");
				String id = sc.next();
				
				if (e != null) {
					System.out.println("Permanent Employee: "+ e.calculateSalary());
				}
			} else if (choice == 6) {
				break;
			} else {
				System.out.println("Enter Valid Choice");
			}
		}
		sc.close();
	}
}
