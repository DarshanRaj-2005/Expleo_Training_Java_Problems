package Java_Basics;

class Demo<Type> {
	public Type data;
	
	public void set(Type data) {
		this.data = data;
	}
	public Type get() {
		return data;
	}
}

public class GenericsExample01 {

	public static void main(String[] args) {
		
		Demo<Integer> d1 = new Demo<>();
		d1.set(10);
		System.out.println(d1.get());
		
		Demo<String> d2 = new Demo<>();
		d2.set("Darshan Raj J");
		System.out.println(d2.get());
	}
}
