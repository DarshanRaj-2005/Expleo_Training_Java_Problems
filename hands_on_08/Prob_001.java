package hands_on_08;
import java.util.Scanner;
import java.lang.Math;

/*Create a class MyCalculator which consists of a single method long power(int, int).
This method takes two integers, n and p ,pass parameters and finds n
p
. If
either n or p is negative, then the method must throw an exception which says " n
or p should not negative". Also, if both n and p are zero, then the method must
throw an exception which says "n and p should not be Zero ".*/

public class Prob_001 {
	
	public long power(int a,int b) throws Exception{
		if (a == 0 && b == 0) {
			throw new Exception("n and p should not be zero");
		}
		if (a <= 0 || b <= 0) {
			throw new Exception("n or p should not be zero");
		}
		long result = (long)Math.pow(a,b);
		return result;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Value n: ");
		int n = sc.nextInt();
		
		System.out.println("Enter a value p: ");
		int p = sc.nextInt();
		
		Prob_001 s = new Prob_001();
		try {
			System.out.println("The Result: "+s.power(n, p));
		}
		catch(Exception e){
			System.out.println(e);
		}
		sc.close();
	}
}
