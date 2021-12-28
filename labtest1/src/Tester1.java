import java.util.*;
public class Tester1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CafeList cafeInUKM = new CafeList();
		ArrayList<Cafe> cafeList = cafeInUKM.getCafeList();
		Cafe c1 = new Cafe("FTSM Garden Cafe", "G1 BlockG, FTSM", 2);
		Cafe c2 = new Cafe("Zarry Bakery & Cafe", "L1 Pusanika", 3);
		Cafe c3 = new Cafe("DeZaaba Cafetaria", "Kolej Zaaba", 5);
		cafeList.add(c1);
		cafeList.add(c2);
		cafeList.add(c3);
		
		System.out.println("Total number of cafe surveyed :"+ cafeList.size());
		for (Cafe c: cafeList) { 
	    	System.out.println("\nCafe's Name : "+ c.getName());
	    	System.out.println("Address : "+ c.getAddress());
	    	System.out.println("No of barista : "+ c.getNoOfBarista());
		}	
	}
	
}
