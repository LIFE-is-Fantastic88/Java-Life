
public class Account {
private Customer customer;
private String accountNumber;
private double balance;
 public Account(Customer a,String accountNumber,double balance) {
	 customer=a;
	 this.accountNumber=accountNumber;
	 this.balance=deposit(balance);
 }
    
	public void displayInfo() {
System.out.println("DETAILS OF ACCOUNT \n--------------------\nName: "+customer.getFirstName()+"\nAccount number: "+getAccNumber()+"\nBalance: RM "+getBalance()+"\n-------------------- ");		
	}

	public void withdrawal(double m) {
		if(m>balance) {
			System.out.println( "Withdrawal: Sorry, balance is not enough.");
		}else if(balance<10)
			System.out.println( "Withdrawal: Sorry, you have to maintain minimum of RM10.00 in your account." );
		else {System.out.println( "Your withdrawal is successful." );
		balance-=m;
		}
	}

	public double deposit(double i) {
      return balance+=i;	
	}
    public Customer getCustomer() {
    	return customer;
    }
    public double getBalance() {
    	return balance;
    }
    public String getAccNumber() {
    	return accountNumber;
    }
}