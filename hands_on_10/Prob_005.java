package hands_on_10;
import java.util.TreeSet;
import java.util.Set;
import java.util.Scanner;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

/*Sample Input: 
Enter a number (or type 'done' to finish): 4 
Enter a number (or type 'done' to finish): 7 
Enter a number (or type 'done' to finish): 7 
Enter a number (or type 'done' to finish): 5 
Enter a number (or type 'done' to finish): 3 
Enter a number (or type 'done' to finish): 9 
Enter a number (or type 'done' to finish): 8 
Enter a number (or type 'done' to finish): done 

Sample Output:  Sorted unique numbers: [3, 4, 5, 7, 8, 9] 
Average: 6.0 
Lowest: 3 
Highest: 9 
Odd numbers: [3, 5, 7, 9]*/

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
		
		System.out.println("Odd Numbers: ");
		while(i.hasNext()) {
			int val = i.next();
			sum += val;
			
			if(val % 2 != 0) {
				System.out.print(val+" ");
			}
		}
		
		List<Integer> list = new ArrayList<>(li);

		avg = sum/li.size();
		System.out.println("\nAverage: "+avg);
		
		System.out.println("Min: "+list.get(0));
		System.out.println("Max: "+list.get(list.size()-1));
		
 		sc.close();
	}
}
