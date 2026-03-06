package Java_Basics;

//Creating inner class and creating an object.

class OuterClass{
	
	int age = 18;
	
	public void checkAge() {
		System.out.println("In CheckAge() Method Call");
	}
	
	class InnerClass {
		public void show() {
			//Using Outer Class Method inside the Inner Class
			checkAge();
			
			System.out.println("In show() Method call of inner class");
			
			//Using Outer Class 
			System.out.println("The Age: "+age);
		}
	}
}

public class InnerClass_Example1 {

	public static void main(String[] args) {
		
		OuterClass outer = new OuterClass();
		OuterClass.InnerClass inner = outer.new InnerClass();
		inner.show();
	}
}
