import java.util.Scanner;

public class View {
	Scanner sc = new Scanner(System.in);
	
	public String start() {
	
	display();
	return sc.nextLine();
	}
	
	public void display() {
		System.out.println("Please select your option\n");
		System.out.println("1. Reserve Vehicles");
		System.out.println("2. Record Rental");
		System.out.println("3. Record Return");
		System.out.println("4. Record Payment");
		System.out.println("0. Exit\n");
	}
	
	public void displayundercontruction() {
		System.out.println("Under Construction\n");
		
	}
	public void printbrandqs() {
		System.out.println("Please enter brand (HONDA/TOYOTA/PERODUA/PROTON/PORCHE)");
		
	}
	public String enterbrandqs() {
		return sc.nextLine();
		
	}
	public void replyunavailable() {
		System.out.println("Sorry your input is currently unavailable\n");
		
	}
	public void printmodelqs() {
		System.out.println("Please enter model (X70/G10/P20/C10/M16)");
		
	}
	public String entermodelqs() {
		return sc.nextLine();
		
	}
	public void printstartdateqs() {
		System.out.println("Please enter start date (DAY/MONTH)");
		
	}
	public String enterstartdateqs() {
		return sc.nextLine();
		
	}
	public void printenddateqs() {
		System.out.println("Please enter end date (DAY/MONTH)");
		
	}
	public String enterenddateqs() {
		return sc.nextLine();
		
	}
	public void printavailable() {
		System.out.println("The vehicle is available\n");
		
	}
	public void printunavailable() {
		System.out.println("The vehicle is unavailable\n");
		
	}
}
