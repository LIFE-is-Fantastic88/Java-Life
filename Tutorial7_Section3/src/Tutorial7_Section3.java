import java.util.Scanner;

public class Tutorial7_Section3 {

	public static String getMonthname(int month) {
		String Monthname = new String();
		if (month == 1) {
			Monthname = "January";
		}
		if (month == 2) {
			Monthname = "February";
		}
		if (month == 3) {
			Monthname = "March";
		}
		if (month == 4) {
			Monthname = "April";
		}
		if (month == 5) {
			Monthname = "May";
		}
		if (month == 6) {
			Monthname = "June";
		}
		if (month == 7) {
			Monthname = "July";
		}
		if (month == 8) {
			Monthname = "August";
		}
		if (month == 9) {
			Monthname = "September";
		}
		if (month == 10) {
			Monthname = "October";
		}
		if (month == 11) {
			Monthname = "November";
		}
		if (month == 12) {
			Monthname = "December";
		}

		return Monthname;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dd= sc.nextInt();
		int month = sc.nextInt();
		int year=sc.nextInt();
		String Monthname = getMonthname(month);
		System.out.print(dd+" "+Monthname+" "+year);
	}

}