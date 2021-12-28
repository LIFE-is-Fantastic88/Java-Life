import java.util.*;

public class Tester2 {

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
		BeverageList c1BevList = c1.getBeverageList();
    	BeverageList c2BevList = c2.getBeverageList();
    	BeverageList c3BevList = c3.getBeverageList();
    	NutritionalInfo caramelLatteNI = new NutritionalInfo(61, 1.2, 10.2, 3.0, 1.2, 50);
    	Beverage b1 = new Beverage("Australia", "Moccona", "Caramel Latte", true, 20.50, 10, caramelLatteNI);
    	NutritionalInfo cappucinoSkimNI = new NutritionalInfo(45, 2.0, 8.0, 2.0, 2.4, 71);
    	Beverage b2 = new Beverage("New Zealand", "Nescafe", "Cappucino Skim", true, 26.0, 10, cappucinoSkimNI);
    	NutritionalInfo chaiLatteNI = new NutritionalInfo(122, 3.2, 17.2, 2.8, 1.0, 100);
    	Beverage b3 = new Beverage("Australia", "Lipton", "Chai Tea Latte", true, 22.50, 10, chaiLatteNI);
    	NutritionalInfo espressoNI = new NutritionalInfo(5, 0.5, 0.0, 2.0, 2.4, 0);
    	Beverage b4 = new Beverage("Brazil", "Robert Timms", "Italian Espresso", true, 16.0, 8, espressoNI);
    	c1BevList.addBeverage(b1);
    	c1BevList.addBeverage(b2);
    	c2BevList.addBeverage(b2);
    	c2BevList.addBeverage(b4);
    	c3BevList.addBeverage(b3);
    	c3BevList.addBeverage(b4);
    	
		System.out.println("Total number of cafe surveyed :"+ cafeList.size());
		System.out.println("\nCafe's name: "+c1.getName()+"\n==============================");
		printDetails(c1BevList.getBeverageList());
		System.out.println("\nCafe's name: "+c2.getName()+"\n==============================");
    	printDetails(c2BevList.getBeverageList());
    	System.out.println("\nCafe's name: "+c3.getName()+"\n==============================");
    	printDetails(c3BevList.getBeverageList());
		
	}
	
	public static void printDetails(ArrayList<Beverage> bevList){
		
		for (Beverage b: bevList) { 
	    	System.out.println("\nBeverage name : "+ b.getName());
	    	System.out.println("Brand : "+ b.getBrand());
	    	System.out.println("Country of origin : "+ b.getOrigin());
	    	System.out.println("Vegan status : "+ b.getVeganStatus());
	    	System.out.println("Price per pack : "+ b.getPricePerPack());
	    	System.out.println("QuantityPerPack: "+ b.getQuantityPerPack());
	    	
	    	
	    }
	}


}
