package Java_Basics;

public class While_Loop {

	public static void main(String[] args) {
		
		int num = 1;
	/*In while it will execute one by one,
		in this while it will print only number which is even*/
		while(num<=20) {
			if(num % 2 == 0) {
				System.out.print(num+" ");
			}
			num++;
		}
	}
}
