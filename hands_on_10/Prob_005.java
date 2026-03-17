package hands_on_10;
import java.util.TreeSet;
import java.util.Set;
import java.util.Scanner;
import java.util.Iterator;


public class Prob_005 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Set<Integer> li = new TreeSet<>(); 
		
		while(true) {
			System.out.println("Enter a number (or type 'done' to finish):");
			String word = sc.nextLine();
			
			if(word.equals("done")) {
				break;
			}
			
			int num = Integer.parseInt(word);
			li.add(num);
		}
		
		Iterator<Integer> i = li.iterator();
		
		int sum = 0;
		double avg = 0;
		
		System.out.println("Sort Unique Numbers: "+li);
		
		while(i.hasNext()) {
			int val = i.next();
			sum += val;
			
			if(val % 2 != 0) {
				System.out.print(val+" ");
			}
		}
		avg = sum/li.size();
		System.out.println("\nAverage: "+avg);
 		sc.close();
	}
}
