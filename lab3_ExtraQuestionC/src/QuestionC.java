import java.util.Scanner;

public class QuestionC {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n >= 1 && n <= 100) {
			for (int p = 1; p <= n; p++) {
				int num = sc.nextInt();
				if (num >= 1 && num <= 1000) {
					int sum = 0;
					int x = 0;
					for (int z = 1; z <= num; z++) {

						if (z % 2 != 0) {
							sum = sum + (x + 1);
						}
						if (z % 2 == 0) {
							sum = sum - (x + 1);
						}
						x++;
					}
					System.out.println("Case #" + p + ":" + sum);

				}
			}
		}
	}
}
