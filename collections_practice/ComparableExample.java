package collections_practice;
import java.util.*;

/*Using CompareTo operator to compare the object to give priority*/

class Mobile implements Comparable<Mobile> {
	private String name;
	private int ram;
	private int price;
	
	Mobile(String name, int ram, int price) {
		this.name = name;
		this.ram = ram;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	public int getRam() {
		return ram;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	
	public int compareTo(Mobile o) {
		return this.ram - o.getRam();
	}
}
public class ComparableExample {

	public static void main(String[] args) {
		
		List<Mobile> li = new ArrayList<>();
		
		li.add(new Mobile("Samsung",16,800));
		li.add(new Mobile("Redmi",8,1000));
		li.add(new Mobile("Apple",4,600));
		
		Collections.sort(li);
		
		System.out.println("List after sorting: ");
		System.out.println("Name"+"\t"+"Ram"+"\t"+"Price");
		for(Mobile mb : li) {
			System.out.println(mb.getName()+"\t"+mb.getRam()+"\t"+mb.getPrice());
		}
	}

}
