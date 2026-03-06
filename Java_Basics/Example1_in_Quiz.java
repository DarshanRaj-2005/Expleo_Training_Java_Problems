package Java_Basics;

//Example in Quiz MCQ

class Base {
	int i;

	void display() {
		System.out.println(i);
	}
}

class Derived extends Base {
	int j;

	void display() {
		System.out.println(j);
	}
}

public class Example1_in_Quiz {

	public static void main(String[] args) {

		Derived obj = new Derived();
		obj.i = 5;
		obj.display();
		obj.j = 10;
		obj.display();
	}

}
