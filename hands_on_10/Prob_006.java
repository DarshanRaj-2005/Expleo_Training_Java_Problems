package hands_on_10;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.lang.Comparable;

class Name implements Comparable<Name>{
	String name;
	
	Name(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Name o) {
		return this.name.compareTo(o.name);
	}
}
public class Prob_006 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Name> list = new ArrayList<>();
		
		System.out.println("Enter the Name:");
		
		String nameList = sc.nextLine();
		String arr[] = nameList.split(",");
		
		for(int i = 0; i < arr.length;i++) {
			list.add(new Name(arr[i]));
		}
		
		Collections.sort(list);
		
		for(Name n : list) {
			System.out.println(n.name);
		}
		sc.close();
	}
}
