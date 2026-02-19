package Java_Basics;

class Employee_e1 {
	int empId;
	String empName;
	double empSalary;
	
	Employee_e1(int empId, String empName, double empSalary) {
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		System.out.println("Employee Record Created");
	}
	Employee_e1() {
		//This method is the example for using parameter constructor inside another constructor
		this(001,"Jaggu",300000);
		System.out.println("Default Constructor called - initialized with default data");
	}
	void registerEmployee() {
		this.displayDetials(); // This method is the example for calling another method using this keyword.
	}
	
	void displayDetials() {
		System.out.println("Employee Id:"+empId);
		System.out.println("Employee Name:"+empName);
		System.out.println("Employee Salary:"+empSalary);
	}
	
	void sendForProcessing() {
		HRDepartment hr = new HRDepartment();
		hr.processEmployee(this);
		//we can pass current object as argument using this 
	}
	
	//using this to return current object
 	Employee_e1 updateSalary(double hikePercentage) {
 		this.empSalary = empSalary + (empSalary * hikePercentage / 100);
		return this;
	}
 	Employee_e1 updateName(String newName) {
 		this.empName = newName;
 		return this;
 	}
}

class HRDepartment {
	void processEmployee(Employee_e1 e) {
		System.out.println("HR Department Processing");
		System.out.println("Processed Employee: "+e.empName+ " with updated "+e.empSalary);
	}
}
public class This_Keyword_Example {

	public static void main(String[] args) {
		
		Employee_e1 e = new Employee_e1();
		
		e.registerEmployee();
		e.sendForProcessing();
		
		System.out.println("---Updating Employee Detials");
		
		e.updateName("Jagadeep").updateSalary(20).displayDetials();
		e.sendForProcessing();
	}
}
