package hands_on_10;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Stack;

/*Julie has created a HashMap containing the name and marks as key-value pairs 
of 6 students. Write a program, with separate user-defined functions to perform the 
following operations: 
a. Push the keys (name of the student) of the hash map into a stack, where 
the corresponding value(marks) is greater than 75. 
b. Pop and display the content of the stack.*/


public class Prob_004 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String,Integer> li = new HashMap<>();
		
		for(int i =0 ;i<6;i++) {
			li.put(sc.nextLine(),sc.nextInt());
			sc.nextLine();
		}
		System.out.println("Students Marks in the HashMap: "+li);	
		System.out.println("Students Mark above 75 in the stack");
		Iterator<Map.Entry<String,Integer>> i = li.entrySet().iterator();
		
		Stack<String> s = new Stack<>();
		
		while(i.hasNext()) {
			Map.Entry<String,Integer> entry = i.next();
			if(entry.getValue() > 75) {
				s.push(entry.getKey());
			}
		}
			
		while(!s.isEmpty()) {
			System.out.println(s.pop());
		}
		sc.close();
	}
}
