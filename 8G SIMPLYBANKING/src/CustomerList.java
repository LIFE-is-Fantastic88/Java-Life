import java.util.ArrayList;

public class CustomerList {
   private ArrayList<Customer> custList;
   public CustomerList() {
	   custList=new ArrayList<Customer>();
   }
	public ArrayList<Customer> getCustomerList() {
		return custList;
	}

	public boolean addCustomer(Customer m) {
	boolean flag;
	for(int z=0;z<custList.size();z++) {
		if(custList.get(z).getCustID().equals(m.getCustID())) {
			return false;
		}
	}custList.add(m);
	return true;
	}

}
