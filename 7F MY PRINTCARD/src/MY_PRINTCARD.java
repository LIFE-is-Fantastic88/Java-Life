import java.util.Scanner;
import java.text.DecimalFormat;

public class MY_PRINTCARD {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");

		int inf = 1;
		for (int z = 1; z <= inf; inf++) {
			String N = sc.nextLine();
			int n = Integer.parseInt(N);

			if (n == 0) {
				break;
			}
			MyPrintCard print = new MyPrintCard();
			
			System.out.println("Case #" + inf + ":");
			for (int x = 1; x <= n; x++) {
				String input1 = sc.nextLine();
				if (input1.equals("=")) {
					System.out.println("RM" + df.format(print.getBalance()));
				} else {
					String num = input1.substring(1, input1.length());
					double num1 = Double.parseDouble(num);
					if (input1.substring(0, 1).equals("+")) {
						print.topupCard(num1);
					} else if (input1.substring(0, 1).equals("-")) {
						print.topupCard(-num1);
					}
				}
			}

		}
	}

}
class MyPrintCard {
	DecimalFormat df=new DecimalFormat("0.00");
	private double balance;
	public MyPrintCard() {
		balance=10;
	}
	double getBalance() {
		return balance;
	}
	void topupCard(double amt) {
		if(payService(amt)==true) {
		System.out.println("RM"+df.format((balance)));}
		else { System.out.println("Invalid");}
	}
	boolean payService(double amt) {
		
		if((balance+amt)<5) {
			return false;
		}else {
			balance+=amt;
			return true;
		}
	}
}
