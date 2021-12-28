import java.util.Scanner;

public class Tutorial7_Section2a {

	public static double calculateArea(double radius) {
		double sum;
		double PI = 3.142;
		sum = PI * radius * radius;
		return sum;
	}

	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		double radius = sc.nextInt();
		double area = calculateArea(radius);
		System.out.print(area);
	}

}
