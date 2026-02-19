package Java_Basics;

class Employee {
	int employeeId;
	String employeeName;
	
	public void setEmployeeDetials(int employeeId,String employeeName) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
	}
	
	public void getEmployeeDetials() {
		System.out.println("Employee Id:"+employeeId);
		System.out.println("Employee Name:"+employeeName);
	}
}
public class Class_Declaration_Example_02 {
	
	public static void main(String[] args) {
		
		Employee obj1 = new Employee();
		Employee obj2 = new Employee();
		
		obj1.setEmployeeDetials(1,"Darshan");
		obj1.getEmployeeDetials();
		obj2.setEmployeeDetials(2,"Jagadeep");
		obj2.getEmployeeDetials();
	}
}
