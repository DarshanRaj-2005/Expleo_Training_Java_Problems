package hands_on_08;

/*to check details of employee */
import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;

class InvalidEmpNumberException extends Exception {
	public InvalidEmpNumberException(String message) {
		super(message);
	}
}

class InvalidDateOfJoinException extends Exception {
	public InvalidDateOfJoinException(String message) {
		super(message);
	}
}

class Employee {

	int empCode;
	String name;
	LocalDate dob;
	LocalDate doj;

	public Employee(int empCode, String name, LocalDate dob, LocalDate doj)
			throws InvalidEmpNumberException, InvalidDateOfJoinException {

		if (empCode <= 0) {
			throw new InvalidEmpNumberException("Employee code must be positive");
		}

		if (!dob.isBefore(doj)) {
			throw new InvalidDateOfJoinException("Date of birth must be before date of appointment");
		}

		this.empCode = empCode;
		this.name = name;
		this.dob = dob;
		this.doj = doj;
	}

	public void displayDetails() {

		System.out.println("Employee Code: " + empCode);
		System.out.println("Employee Name: " + name);
		System.out.println("Date of Birth: " + dob);
		System.out.println("Date of Appointment: " + doj);

		Period experience = Period.between(doj, LocalDate.now());
		System.out.println("Experience: " + experience.getYears() + " years");
	}
}

public class Prob_003 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try {

			System.out.println("Enter Employee Code:");
			int code = sc.nextInt();

			sc.nextLine();

			System.out.println("Enter Employee Name:");
			String name = sc.nextLine();

			System.out.println("Enter Date of Birth (YYYY-MM-DD):");
			LocalDate dob = LocalDate.parse(sc.next());

			System.out.println("Enter Date of Appointment (YYYY-MM-DD):");
			LocalDate doj = LocalDate.parse(sc.next());

			Employee emp = new Employee(code, name, dob, doj);

			emp.displayDetails();

		} catch (InvalidEmpNumberException e) {
			System.out.println(e.getMessage());
		} catch (InvalidDateOfJoinException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println("Invalid input format");
		}

		sc.close();
	}

}
