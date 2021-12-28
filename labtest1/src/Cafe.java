import java.util.ArrayList;

public class Cafe {
private String name;
private String address;
private int noOfBarista;
private BeverageList beverageList;
   public Cafe(String a,String b,int c) {
	   beverageList=new BeverageList();
	   this.name=a;
	   this.address=b;
	   this.noOfBarista=c;
	   
   }
	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public int getNoOfBarista() {
		return noOfBarista;
	}
	public BeverageList getBeverageList() {
		return beverageList;
	}
	public void displayLowestCalory(ArrayList<Beverage>blist) {
		double num=100;
		for(int z=0;z<blist.size();z++) {
			if(blist.get(z).getNutitionalInfo().getEnergy()<num) {
				num=blist.get(z).getNutitionalInfo().getEnergy();
			}
			
		}System.out.println("Lowest beverage calory in "+getName()+" :"+num);
		System.out.println();

	}
	public void displayTotalOrigin(ArrayList<Beverage> beverageList2) {
		int sum=0;
		
		for(int z=0;z<beverageList2.size();z++) {
			if(beverageList2.get(z).getOrigin().equals("Australia")) {
				sum++;
			}
			
		}	System.out.println("Total beverage from Australia in "+getName()+" :"+sum);	
		System.out.println();
	}

}
