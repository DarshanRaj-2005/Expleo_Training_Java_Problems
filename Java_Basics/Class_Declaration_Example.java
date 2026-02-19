package Java_Basics;

class Theatre {
	int theatreId = 4532;
	String theatreName = "INOX";
	String theatreLocation = "Kochi";
	
	public void displayTheatre() {
		System.out.println("Theatre Id:"+theatreId);
		System.out.println("Theatre Name:"+theatreName);
		System.out.println("Theatre Location:"+theatreLocation);
	}
}
public class Class_Declaration_Example {

    
	public static void main(String[] args) {
		
		Theatre obj1 = new Theatre();
		obj1.displayTheatre();
	}
}
