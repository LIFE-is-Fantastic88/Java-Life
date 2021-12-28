import java.util.ArrayList;
public class BeverageList {
private ArrayList<Beverage>beverageList;
 public BeverageList() {
	 beverageList=new ArrayList<Beverage>();
 }
	public void addBeverage(Beverage b1) {
       beverageList.add(b1);		
	}
	public ArrayList<Beverage> getBeverageList(){
		return beverageList;
	}

}
