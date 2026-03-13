package hands_on_08;

class Test<T,U,R> {
	public T obj1;
	public U obj2;
	public R obj3;
	
	public Test(T obj1,U obj2,R obj3) {
		this.obj1 = obj1;
		this.obj2 = obj2;
		this.obj3 = obj3;
	}
	
	public void get() {
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
	}
}
public class GenericsExample2 {

	public static void main(String[] args) {
		
		Test<String,Integer,Float> t1 = new Test<>("Darshan",10,0.7f);
		t1.get();
	}
}
