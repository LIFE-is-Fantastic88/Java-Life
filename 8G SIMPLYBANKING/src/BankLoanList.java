import java.util.ArrayList;

public class BankLoanList {
private ArrayList<BankLoan>blList;
  public BankLoanList() {
	  blList=new ArrayList<BankLoan>();
  }
	public boolean addLoan(BankLoan m) {
		boolean flag;
		for(int z=0;z<blList.size();z++) {
			if(blList.get(z).getAccount().getAccNumber().equals(m.getAccount().getAccNumber())) {
				return false;
			}
				
			
		}blList.add(m);
		return true;
	}

	public ArrayList<BankLoan> getLoanList() {
		return blList;
	}
	public int calculateHighLoan() {
		int num=0;
		for(int z=0;z<blList.size();z++) {
			if(blList.get(z).calculateLoan()>=500000) {
				num++;
			}
		}
		return num;
	}
	public int calculateLongestInstallment() {
		int num1=0;
		for(int z=0;z<blList.size();z++) {
			if(blList.get(z).getYear()>=25) {
				num1++;
			}		
	}return num1;
	
	}
}
