package collections_practice;
import java.util.Vector;

/*Vector using add,remove and capacity and giving size*/

public class VectorExample {

	public static void main(String[] args) {
		//Giving the size as 3
		Vector<Integer> li = new Vector<>(2);
		System.out.println("The Current Capacity: "+li.capacity());
		System.out.println("Size of Vector before adding: "+li.size());
		li.add(1);
		li.add(2);
		li.add(3);
		li.add(4);
		System.out.println("Size of Vector after adding: "+li.size());
		//if the given size is exceeded it will make 2 times of given size.
		System.out.println("The Final Capacity: "+li.capacity());
		System.out.println("Before remove: "+li);
		li.remove(0);
		System.out.println("After remove: "+li);
	}
}
