package collections_practice;
import java.util.Stack;

/*Using Stack using stack methods and also collection method*/

public class StackExample {

	public static void main(String[] args) {
		Stack<Integer> st = new Stack<>();
		System.out.println("Size of Stack before adding: "+st.size());
		st.add(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);
		System.out.println("Size of Stack after adding: "+st.size());
		System.out.println("The Stack before remove: "+st);
		
		st.remove(0);
		st.pop();
		System.out.println("The Stack after remove: "+st);
		System.out.println("The peek element: "+st.peek());
	}
}
