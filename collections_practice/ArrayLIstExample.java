package collections_practice;
import java.util.List;
import java.util.ArrayList;

/*Array List program to add and remove element and using size() method*/
public class ArrayLIstExample {

	public static void main(String[] args) {
		
		List<String> li = new ArrayList<>();
		System.out.println("Size of ArrayList before adding: "+li.size());
		li.add("A");
		li.add("B");
		li.add("C");
		li.add("D");
		li.add("E");
		li.add("F");
		li.add(2,"G");
		System.out.println(li);
		System.out.println("Size of ArrayList after adding: "+li.size());
		li.remove("A");
		li.remove(5);
		System.out.println("After removing: "+li);
	}
}
