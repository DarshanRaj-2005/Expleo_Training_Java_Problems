package Java_Basics;

class Base_2 {
	public Base_2() {
		System.out.println("Base");
	}
}

public class Example3_in_Quiz extends Base_2 {
	public Example3_in_Quiz() {
		this("java");
		System.out.println("Derived");
	}

	public Example3_in_Quiz(String s) {
		System.out.println(s);
	}

	public static void main(String[] args) {
		
		new Example3_in_Quiz();
	}

}
