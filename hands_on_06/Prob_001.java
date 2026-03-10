package hands_on_06;

//class hierarchy and display the details of student and staff Object

class Person {
	String name;
	String address;
	
	Person(String name, String address) {
		this.name = name;
		this.address = address;
	}
	
	public String getName() {
		return name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + "]";
	}
}

class Student extends Person {
	String program;
	int year;
	double fee;
	
	Student(String name, String address, String program, int year, double fee) {
		super(name,address);
		this.program = program;
		this.year = year;
		this.fee = fee;
	}
	
	public void setProgram(String program) {
		
	}
	
	public String getProgram() {
		return program;
	}
	
	public void setYear(int year) {
		
	}
	
	public int getYear() {
		return year;
	}
	
	public void setFee(double fee) {
		
	}
	
	public double getFee() {
		return fee;
	}

	@Override
	public String toString() {
		return "Student [Person [name= " + name + ", address= "+address+" program=" +
	    program + ", year=" + year + ", fee=" + fee + "]";
	}
}

public class Prob_001 {

	public static void main(String[] args) {

	}

}
