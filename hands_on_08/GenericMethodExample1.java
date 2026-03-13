package hands_on_08;

public class GenericMethodExample1 {
	
	static <T> void getDisplay(T element) {
		System.out.println(element.getClass().getName()+" = "+element);
	}

	public static void main(String[] args) {
		getDisplay(44);
		getDisplay("Jaggu");
		getDisplay(1.0);
	}
}
