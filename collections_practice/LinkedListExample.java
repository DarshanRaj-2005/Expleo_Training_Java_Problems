package collections_practice;
import java.util.List;
import java.util.LinkedList;

/*example for linked list using add, remove and size()*/

public class LinkedListExample {

	public static void main(String[] args) {
		
		List<String> li = new LinkedList<>();
		System.out.println("Size of LinkedList before adding: "+li.size());
		
		li.add("A");
		li.add("B");
		li.addFirst("V");
		li.addLast("C");
		
		System.out.println("Size of LinkedList after adding: "+li.size());
		System.out.println("List: "+li);
		
		li.remove("A");
		li.remove(2);
		
		System.out.println("After remove: "+li);
	}

}
