package Java_Basics;

import java.util.List;
import java.util.ArrayList;

public class WildcardGeneric {

	public static void main(String[] args) {

		List<Integer> li = new ArrayList<>();
		li.add(5);
		li.add(10);
		li.add(15);

		double sum = sum(li);
		System.out.println("Sum of ints: " + sum);

	}

	public static double sum(List<? extends Number> list) {
		double sum = 0;
		for (Number n : list) {
			sum += n.doubleValue();
		}
		return sum;
	}
}
