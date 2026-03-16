package collections_practice;
import java.util.PriorityQueue;
import java.util.Queue;

/*Priority Queue to add and using poll to remove the head element and return */

public class PriorityQueueExample {

	public static void main(String[] args) {
		
		Queue<String> pq = new PriorityQueue<>();
		System.out.println("Size before inserting element: "+pq.size());
		pq.add("Z");
		pq.add("B");
		pq.add("N");
		pq.add("A");
		pq.add("V");
		System.out.println("Size after inserting element: "+pq.size());
		//poll return the first element
		System.out.println("ELements: "+pq.element());
		System.out.println(pq);
	}
}
