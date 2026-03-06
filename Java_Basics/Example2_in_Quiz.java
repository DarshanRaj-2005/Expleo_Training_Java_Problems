package Java_Basics;

//Example in Quiz

class Base_1 {
	int i;

	void display() {
		System.out.println(i);
	}
}

class Derived_1 extends Base_1 {
	int j;

	void display() {
		super.display();
		System.out.println(j);
	}
}

public class Example2_in_Quiz {

	public static void main(String[] args) {

		Derived_1 obj = new Derived_1();
		obj.i = 5;
		obj.j = 10;
		obj.display();
	}

}
