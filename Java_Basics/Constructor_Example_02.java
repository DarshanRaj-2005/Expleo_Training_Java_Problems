package Java_Basics;

class Employee_03 {
	int employeeId;
	String employeeName;
	
	Employee_03() { //Default Constructor
		this.employeeId = employeeId;
		this.employeeName = employeeName;
	}
	
	public void getEmployeeDetials() {
		System.out.println("Employee Id: "+employeeId);
		
		System.out.println("Employee Name: "+employeeName);
	}
}
public class Constructor_Example_02 {

	public static void main(String[] args) {
		
		Employee_03 e = new Employee_03();  //Constructor will called
		e.getEmployeeDetials();

	}

}
