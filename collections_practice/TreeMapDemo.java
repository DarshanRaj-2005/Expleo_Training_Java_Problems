package collections_practice;

import java.util.TreeMap;
import java.util.Set;
import java.util.Map;

/*Using Tree map to put and print the keys and values*/

public class TreeMapDemo {

	public static void main(String[] args) {
		Map<Integer, Double> tm = new TreeMap<>();

		System.out.println("Size of the hashmap: " + tm.size());
		tm.put(203, 23.21);
		tm.put(506, 25.15);
		tm.put(101, 21.10);
		tm.put(56, 55.45);

		System.out.println("Elements in the hashmap: " + tm);
		System.out.println("Size of the Hashmap: " + tm.size());

		Set<Map.Entry<Integer, Double>> set = tm.entrySet();

		for (Map.Entry<Integer, Double> me : set) {
			System.out.print(me.getKey() + "  ");
			System.out.println(me.getValue());
		}
	}
}
