import java.util.ArrayList;

public class Cafe {
private String name;
private String address;
private int noOfBarista;
private BeverageList beverageList;
public Cafe(String name,String address,int noOfBarista) {
	this.name=name;
	this.address=address;
	this.noOfBarista=noOfBarista;
	beverageList=new BeverageList();
}
 String getName() {
	return name;
}
 String getAddress() {
	 return address;
 }
 int getNoOfBarista() {
	 return noOfBarista;
 }
 BeverageList getBeverageList() {
	 return beverageList;
	}

	public void displayLowestCalory(ArrayList<Beverage> blist) {
		double min = 100;

		for (int z = 0; z < blist.size(); z++) {
			if (blist.get(z).getnutritionalinfo().getEnergy() < min) {
				min = blist.get(z).getnutritionalinfo().getEnergy();
			}
		}
		System.out.println("Lowest beverage calory in " + getName() + " :" + min);
	
}
	public void displayTotalOrigin(ArrayList<Beverage> bList) {
		int num=0;
		for (int z = 0; z < bList.size(); z++) {
			if (bList.get(z).getOrigin().equals("Australia")) {
				num++;
			}
		}
		System.out.println("Total beverage from Australia in "+ getName() + " :" +num);		
	}
 
}
