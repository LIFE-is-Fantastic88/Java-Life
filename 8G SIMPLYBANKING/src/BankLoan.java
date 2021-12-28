
public class BankLoan {
   private Account custAccount;
   private double basicSalary;
   private double eligibility;
   private double hastopay;
   private int year;
   public BankLoan(double b,Account m,int y) {
	   custAccount=m;
	   basicSalary=b;
	   year=y;
   }
   public Account getAccount() {
	   return custAccount;
   }
public int getYear() {
	return year;
}
public double calculateLoan() {
		eligibility = basicSalary * 100;
		return eligibility;
	}

	public double calculateMonthly() {
		hastopay = (int) calculateLoan() / year / 12;
		return hastopay;
	}

	public void displayInfo() {
		System.out.println("Summary of Loan\n--------------------\nName: " + custAccount.getCustomer().getFirstName()
				+ "\nAccount number: " + custAccount.getAccNumber() + "\nAmount loan eligible: " + eligibility
				+ "\nMonthly payment: RM" + hastopay + "\nDuration: " + year + " years");

	}
}
