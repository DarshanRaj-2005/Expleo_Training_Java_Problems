package Java_Basics;

//Creating inner class using static and no static method and calling it

class Person {
	int age = 21;
	static int weight = 45;
	
	static class Gender {
		void nonStaticDisplay() {
			System.out.println("In Non-Static Display Method");
			System.out.println("Weight value: "+ weight);
		}
	static void staticDisplay() {
		System.out.println("In Static Display Method");
	}
	}
	Gender g = new Gender();
}
public class InnerClass_using_Static {

	public static void main(String[] args) {
		
		Person p = new Person();
		p.g.nonStaticDisplay();
		Person.Gender.staticDisplay();
	}
}
