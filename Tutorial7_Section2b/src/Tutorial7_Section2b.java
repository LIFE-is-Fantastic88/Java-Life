import java.util.Scanner;
import java.text.DecimalFormat;

public class Tutorial7_Section2b {

	public static double toCelcius(double farenheit) {
		double num;
		num = ((farenheit - 32) / 1.8);
		return num;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat dc = new DecimalFormat("0.00");
		double farenheit = sc.nextDouble();
		double celcius = toCelcius(farenheit);
		System.out.print(dc.format(celcius));

	}

}
