import java.util.Scanner;

public class QuestionF {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		if (n > 0 && n <= 100) {
			int sum = 0;

			while (n != -1) {
				if (n % 4 == 0) {
					sum = sum + 1;
				}
				n = sc.nextInt();

			}
			System.out.print(sum);
		}
	}
}
