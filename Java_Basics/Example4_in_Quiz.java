package Java_Basics;

class Base_3 {
	public void displayBase() {
		System.out.println("Base class Method");
	}
}

public class Example4_in_Quiz extends Base_3 {
	public void displayDerived() {
		System.out.println("Derived class Method");
	}

	public Example4_in_Quiz(String s) {
		System.out.print(s);
	}

	public static void main(String[] args) {

		new Example4_in_Quiz();
	}

}
