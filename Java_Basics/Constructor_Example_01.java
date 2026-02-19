package Java_Basics;

class Employee_02 {
	int employeeId;
	String employeeName;
	
	Employee_02(int employeeId,String employeeName) { //Parameterized Constructor
		this.employeeId = employeeId;
		this.employeeName = employeeName;
	}
	
	public void getEmployeeDetials() {
		System.out.println("Employee Id: "+employeeId);
		System.out.println("Employee Name: "+employeeName);
	}
}
public class Constructor_Example_01 {

	public static void main(String[] args) {
		Employee_02 e = new Employee_02(01,"Jaggu");  //Constructor will called
		e.getEmployeeDetials();
	}
}
