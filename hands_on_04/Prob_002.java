package hands_on_04;
import java.util.Scanner;
import java.time.LocalTime;
//Employee Attendance

class Employee {
	private int emp_Id;
	private String empName;
	
	Employee(int emp_Id,String empName) {
		this.emp_Id = emp_Id;
		this.empName = empName;
	}
	
	public String getEmployeeName() {
		return empName;
	}

	public void markCheckIn(Attendance attendance) {
		attendance.markCheckIn();
	}
	public void markCheckOut(Attendance attendance) {
		attendance.markCheckOut();
	}
}

class Attendance {
	private int empid;
	private LocalTime checkInTime;
	private LocalTime checkOutTime;
	boolean isCheckedIn;
	boolean isCheckedOut;
	
	Attendance(int empid) {
		this.empid = empid;
		this.isCheckedIn = false;
		this.isCheckedOut = false;
	}
	
	public void markCheckIn() {
		if(isCheckedIn) {
			System.out.println("Check in already recorded");
			return;
		}
		checkInTime = LocalTime.now();
		isCheckedIn = true;
		System.out.println("Checked In was Successful");
	}
	public void markCheckOut() {
		if(isCheckedOut) {
			System.out.println("Check out already recorded");
			return;
		}
		if(!isCheckedIn) {
			System.out.println("Cannot Check Out without Check In");
			return;
		}
		checkOutTime = LocalTime.now();
		isCheckedOut = true;
		System.out.println("Check Out Successful");
	}
	public void getAttendanceDetials(Employee another) {
		if (isCheckedOut) {
			System.out.println("-----------------------------");
			System.out.println("Employee Id: "+this.empid);
			System.out.println("Employee Name: "+another.getEmployeeName());
			System.out.println("Check-In Time: "+checkInTime);
			System.out.println("Check-Out Time: "+checkOutTime);
			System.out.println("-----------------------------");
			System.out.println();
		}
		else {
			System.out.println("-----------------------------");
			System.out.println("Employee Id: "+this.empid);
			System.out.println("Employee Name: "+another.getEmployeeName());
			System.out.println("Check-In Time: "+checkInTime);
			System.out.println("Yet to be Checked Out");
			System.out.println("-----------------------------");
			System.out.println();
		}
	}
}
public class Prob_002 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Employee e1 = null;
		
		Attendance a1 = null;
		
		
		do {
			System.out.println("1.CheckIn");
			System.out.println("2.Checkout");
			System.out.println("3.Employee Attendance Detials");
			System.out.println("4.Exit");
			
			int action = sc.nextInt();
			
			if (action == 1) {
				if (e1 == null) {
					System.out.println("Enter Employee Id:");
					int id = sc.nextInt();
					sc.nextLine();
					System.out.println("Enter Employee Name:");
					String name = sc.nextLine();
					
					e1 = new Employee(id,name);
					a1 = new Attendance(id);
					
				}
				e1.markCheckIn(a1);
			}
			
			if (action == 2) {
				if (e1 == null) {
					System.out.println("check in first");
				}
				else {
					e1.markCheckOut(a1);
				}
			}
			
			else if (action == 3) {
				if (e1 != null) {
					a1.getAttendanceDetials(e1);
				}
				else {
					System.out.println("Check in to get Employee Detials");
				}
			}
			else if (action == 4) {
				break;
			}
		}while(true);
	}
}
