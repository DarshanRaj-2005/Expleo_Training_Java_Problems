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

public class Prob_001 {

	public static void main(String[] args) {

	}

}
