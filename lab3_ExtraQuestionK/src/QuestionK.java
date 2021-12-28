import java.util.Scanner;

public class QuestionK {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		if (n >= 1 && n <= 20) {
			for (int z = 1; z <= n; z++) {

				double width = sc.nextDouble();
				double length = sc.nextDouble();
				if (width >= 1 && width <= 10000 && length >= 1 && length <= 10000) {
					double num1 = width / 30;
					double num2 = length / 30;

					if (num1 % 1 > 0) {
						num1 = num1 + 1;

					}
					if (num2 % 1 > 0) {
						num2 = num2 + 1;

					}
					num1 = num1 - (num1 % 1);
					num2 = num2 - (num2 % 1);
					double sum = num1 * num2;
					System.out.printf("%.0f", sum);
					System.out.println();
				}
			}
		}
	}
}
