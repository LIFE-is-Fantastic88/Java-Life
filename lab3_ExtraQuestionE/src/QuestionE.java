import java.util.Scanner;

public class QuestionE {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n >= 1 && n <= 100) {
			for (int z = 1; z <= n; z++) {
				int num1 = sc.nextInt();

				double sum = 0;
				int p = 0;
				while (num1 != 0) {
					sum = sum + ((num1 % 10) * Math.pow(2, p));
					num1 = num1 / 10;
					p++;
				}
				System.out.printf("Case #" + z + ": %.0f\n", sum);
			}
		}
	}
}
