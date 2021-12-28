import java.util.Scanner;

public class QuestionD {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n >= 1 && n <= 100) {
			for (int z = 1; z <= n; z++) {
				int num = sc.nextInt();

				int sum = 0;
				while (num != 0) {
					sum = sum + (num % 10);
					num = num / 10;

				}
				System.out.println("Case #" + z + ":" + sum);
			}
		}

	}
}
