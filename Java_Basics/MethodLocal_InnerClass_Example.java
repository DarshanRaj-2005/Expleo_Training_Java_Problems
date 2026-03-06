package Java_Basics;


class OuterClass_01 {
	int value = 56;
	
	public void outerCall() {
		
		System.out.println("Inside the method of outer class");
		class InnerClass_01 {
			public void innerCall() {
				System.out.println("The Method inside inner class");
				System.out.println("The Value: " + value);
			}
		}
		InnerClass_01 inner = new InnerClass_01();
		inner.innerCall();
	}
}
public class MethodLocal_InnerClass_Example {

	public static void main(String[] args) {
		
		OuterClass_01 outer = new OuterClass_01();
		outer.outerCall();
	}
}
