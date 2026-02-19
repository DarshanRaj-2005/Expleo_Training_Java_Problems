package Java_Basics;

class Employee_01 {
	int employeeId;
	String employeeName;
	
	public void setDetials(int id, String name) {
		employeeId = id;
		employeeName = name;
	}
	public void getDetials() {
		System.out.println("Employee Id:"+employeeId);
		System.out.println("Employee Name:"+employeeName);
	}
}
public class Array_Of_Objects {

	public static void main(String[] args) {
		
		Employee_01 obj[] = new Employee_01[3];
		
		for(int i = 0;i < 3;i++) {
			obj[i] = new Employee_01();
		}
		
		obj[0].setDetials(1,"Dharshan");
		obj[0].getDetials();
		obj[1].setDetials(2,"Jaggu");
		obj[1].getDetials();
	}
}
