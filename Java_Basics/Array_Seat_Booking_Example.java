package Java_Basics;
import java.util.Scanner;

//Program to find the seat count in ticket booking using multi dimensional array

public class Array_Seat_Booking_Example {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String seatType[][] = new String[][] {{"B","B","A","A","A"},{"A","A","B","B","A"},
			                  {"A","B","A","A","B"},{"A","A","A","B","B"}};
			                  
	    int vipCount = 0, premiumCount = 0, regularCount = 0;
	    int vipTotal = 5, premiumTotal = 10, regularTotal = 5;
	    
	    
	    for(int i=0;i<seatType.length;i++) {
	    	
	    	for(int j=0;j<seatType[i].length;j++) {
	    		
	    		if (i==0 && seatType[i][j].equals("A")) {
	    			vipCount++;
	    		}
	    		else if (i >0 && i<3 && seatType[i][j].equals("A")) {
	    			premiumCount++;
	    		}	
	    		else if (i==3 && seatType[i][j].equals("A")) {
	    			regularCount++;
	    		}
	    	}
	    }
	    System.out.println("Enter the Seat Type(vip/premium/regular)");
	    String seat = sc.nextLine().toLowerCase();
	    
	    if (seat.equals("vip")) {
	    	System.out.println("----VIP Seats:---- ");
	    	System.out.println("Total: "+vipTotal+ "  Available: "+vipCount +
	    			"  Booked: "+(vipTotal - vipCount));
	    }
	    else if (seat.equals("premium")) {
	    	System.out.println("----PREMIUM Seats:---- ");
	    	System.out.println("Total: "+premiumTotal+ "  Available: "+premiumCount +
	    			"  Booked: "+(premiumTotal - premiumCount));
	    }
	    else if (seat.equals("regular")) {
	    	System.out.println("----REGULAR Seats:---- ");
	    	System.out.println("Total: "+regularTotal+ "  Available seats: "+regularCount+
	    			"  Booked: "+(regularTotal - regularCount));
	    }
	    else {
	    	System.out.println("Enter correct seat type");
	    }
		sc.close();
	}
}
