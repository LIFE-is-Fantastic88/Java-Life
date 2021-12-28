import java.util.ArrayList;

public class TesterST3{

	public static void main(String args[]){

		CustomerList custList = new CustomerList();
		BankLoanList loanList = new BankLoanList();

		Customer cust1 = new Customer("ID-123", "MeiYing", "Chan", "Jln 1, Bandar Baru Bangi", "011-1234567");
		Account ac1 = new Account (cust1,"AN-123", 20.0);
		BankLoan b1 = new BankLoan (6000.0,ac1,30);

		Customer cust2 = new Customer("ID-124", "Yaya", "Ahmad", "Jln 2, Bandar Baru Nilai", "012-1234567");
		Account ac2 = new Account (cust2,"AN-124", 300.0);
		BankLoan b2 = new BankLoan (8000.0,ac2,25);

		Customer cust3 = new Customer("ID-125", "Gopal", "Maniam", "Jln 3, Bandar baru Kajang", "013-1234567");
		Account ac3 = new Account (cust3,"AN-125", 500.0);
		BankLoan b3 = new BankLoan (10000.0,ac3,30);

		Customer cust4 = new Customer("ID-126", "Boya", "TokAba", "Jln 4, Banda Baru", "014-1234567");
		Account ac4 = new Account (cust4,"AN-126", 10.0);
		BankLoan b4 = new BankLoan (1000.0,ac4,15);


		Customer cust5 = new Customer("ID-127", "Adudu", "Aduh", "Jln 3, Pulau Rintis", "015-1234567");
		Account ac5 = new Account (cust5,"AN-127", 15.0);
		BankLoan b5 = new BankLoan (4500.0,ac5,20);

		addNewCustomer (custList,cust1);
		addNewLoan(loanList,b1);

		addNewCustomer(custList,cust2);
		addNewLoan (loanList,b2);

		addNewCustomer(custList,cust3);
		addNewLoan (loanList,b3);

		addNewCustomer(custList,cust4);
		addNewLoan (loanList,b4);

		addNewCustomer(custList,cust5);
		addNewLoan (loanList,b5);

		ArrayList <Customer> cust = custList.getCustomerList();
		ArrayList <BankLoan> bl = loanList.getLoanList();

		if(cust == null)
			System.out.println("Error: ArrayList object was not created");
		else
			System.out.println("Total Customer Registered: "+cust.size());

		if(bl == null)
			System.out.println("Error: ArrayList object was not created");
		else
			System.out.println("Total Bank loan Registered: "+bl.size());



		displayLoanInfo(bl);


	}

	public static void addNewCustomer(CustomerList t, Customer m){

		if(t.addCustomer(m))
			System.out.println("Addition of a new customer: "+m.getFirstName()+" "+m.getLastName()+" is successfull");
		else
			System.out.println("Addition of a new customer: "+m.getFirstName()+" "+m.getLastName()+" has failed, because this person is already exist in the list");

	}

	public static void addNewLoan(BankLoanList t, BankLoan m){

		if(t.addLoan(m))
			System.out.println("Creation of a new account for: "+m.getAccount().getCustomer().getFirstName()+" (" +m.getAccount().getAccNumber()+") is successfull");
		else
			System.out.println("Creation of a new account: "+m.getAccount().getAccNumber()+" has failed, because this account is already exist in the list");

	}


	public static void displayLoanInfo(ArrayList <BankLoan> bloan ){

		for	(BankLoan bl: bloan){

			bl.calculateLoan();
			bl.calculateMonthly();
			bl.displayInfo();


		}




	}



}