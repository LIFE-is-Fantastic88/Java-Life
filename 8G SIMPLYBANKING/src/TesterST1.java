import java.util.ArrayList;

public class TesterST1{

	public static void main(String args[]){

		CustomerList custList = new CustomerList();
		Customer cust1 = new Customer("ID-123", "MeiYing", "Chan", "Jln 1, Bandar Baru Bangi", "011-1234567");
		Customer cust2 = new Customer("ID-124", "Yaya", "Ahmad", "Jln 2, Bandar Baru Nilai", "012-1234567");
		Customer cust3 = new Customer("ID-125", "Gopal", "Maniam", "Jln 3, Bandar Baru Kajang", "013-1234567");
		Customer cust4 = new Customer("ID-126", "Boya", "TokAba", "Jln 4, Banda Baru", "014-1234567");
		Customer cust5 = new Customer("ID-125", "Gopal", "Maniam", "Jln 3, Bandar baru Kajang", "013-1234567");


		addNewCustomer (custList,cust1);
		addNewCustomer (custList,cust2);
		addNewCustomer (custList,cust3);
		addNewCustomer (custList,cust4);
		addNewCustomer (custList,cust5);

		ArrayList <Customer> cust = custList.getCustomerList();

		if(cust == null)
			System.out.println("Error: ArrayList object was not created");
		else
			System.out.println("Total Customer Registered: "+cust.size());

		}

	public static void addNewCustomer(CustomerList t, Customer m){

		if(t.addCustomer(m))
			System.out.println("Addition of a new customer: "+m.getLastName()+" "+m.getLastName()+" is successfull");
		else
			System.out.println("Addition of a new customer: "+m.getLastName()+" "+m.getLastName()+" has failed, because this person is already exist in the list");

	}



}