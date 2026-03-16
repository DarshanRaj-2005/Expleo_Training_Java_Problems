package collections_practice;
import java.util.List;
import java.util.ArrayList;

/* Array List using integer type and converting arrayList into array*/

public class ArrayListExample2 {

	public static void main(String[] args) {
		
		List<Integer> li = new ArrayList<>();
		System.out.println("Size of ArrayList before adding: "+li.size());
		li.add(1);
		li.add(2);
		li.add(3);
		li.add(4);
		System.out.println("Size of ArrayList after adding: "+li.size());
		System.out.println("ArrayList: "+li);
		
		//Converting arrayList to array
		
		Integer arr[] = new Integer[li.size()];
		arr = li.toArray(arr);
		
		int sum = 0;
		
		for(int i : arr) {
			sum += i;
		}
		
		System.out.println("Sum value is: "+sum);
	}
}
