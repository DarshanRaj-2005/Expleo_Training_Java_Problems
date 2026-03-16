package collections_practice;
import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;

/*Using Splitrator and foreachremaining*/

public class SpliteratorExample {

	public static void main(String[] args) {
		
		List<Integer> li = new ArrayList<>();
		System.out.println("Size of ArrayList before adding: "+li.size());
		li.add(1);
		li.add(2);
		li.add(3);
		li.add(4);
		li.add(5);
		li.add(6);
		
		System.out.println("Contents of arraylist using tryadvance: ");
		Spliterator<Integer> sitr = li.spliterator();
		while(sitr.tryAdvance((n) -> System.out.print(n+" ")));
		System.out.println();
		
		System.out.println("Contents of array using forEachRemaining: ");
		sitr = li.spliterator();
		sitr.forEachRemaining((n) -> System.out.print(n+" "));
		System.out.println();
		System.out.println("size of array list after insertion: "+li.size());
	}
}
