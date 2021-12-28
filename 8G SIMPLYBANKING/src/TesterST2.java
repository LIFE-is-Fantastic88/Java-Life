import java.util.ArrayList;

public class TesterST2{

	public static void main(String args[]){

		CustomerList custList = new CustomerList();
		Customer cust1 = new Customer("ID-123", "MeiYing", "Chan", "Jln 1, Bandar Baru Bangi", "011-1234567");
		Account ac = new Account (cust1,"AN-123", 20.0);


		addNewCustomer (custList,cust1);
		ArrayList <Customer> cust = custList.getCustomerList();

		if(cust == null)
			System.out.println("Error: ArrayList object was not created");
		else
			System.out.println("Total Customer Registered: "+cust.size());

		displayAccountInfo(ac);

	}

	public static void addNewCustomer(CustomerList t, Customer m){

		if(t.addCustomer(m))
			System.out.println("Addition of a new customer: "+m.getFirstName()+" "+m.getLastName()+" is successfull");
		else
			System.out.println("Addition of a new customer: "+m.getFirstName()+" "+m.getLastName()+" has failed, because this person is already exist in the list");

	}
	public static void displayAccountInfo(Account ac ){
		ac.displayInfo();
		ac.withdrawal(100.0);
		ac.deposit (300);
		ac.displayInfo();
		ac.withdrawal(100);
		ac.displayInfo();

	}


}