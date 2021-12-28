import java.text.DecimalFormat;
import java.util.Scanner;

public class RAIN_KEEP_FALL3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		int numnum = 1;
		int cases = 1;
		for (int q = 1; q <= numnum; numnum++) {
			int input1 = sc.nextInt();
			int input2 = sc.nextInt();
			if (input1 == 0 && input2 == 0) {
				break;
			}
			int year = (input2 - input1) + 1;
			Double arr[][] = new Double[year][12];
			String monthname[] = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov",
					"Dec" };
			for (int yearnum = 0; yearnum < year; yearnum++) {
				for (int month = 0; month < 12; month++) {
					arr[yearnum][month] = sc.nextDouble();
				}
			}
			System.out.println("Case #" + cases + ":");
			cases++;
			int year2 = input1;
			for (int yearnum1 = 0; yearnum1 < year; yearnum1++) {
				double sum = 0;
				double sum1 = 0;
				double sum2 = 100;
				int n = 0;
				int m = 0;
				for (int month1 = 0; month1 < 12; month1++) {
					sum = sum + arr[yearnum1][month1];
					if (arr[yearnum1][month1] > sum1) {
						sum1 = arr[yearnum1][month1];
						n = month1;
					}
					if (arr[yearnum1][month1] <= sum2) {
						sum2 = arr[yearnum1][month1];
						m = month1;
					}
					if (month1 == 11) {
						double average = sum / 12;
						System.out.println("Year " + year2 + ": Avg: " + df.format(average) + " Lo: " + monthname[m]
								+ " Hi: " + monthname[n]);
					}
				}
				year2++;
			}
		}
	}
}
