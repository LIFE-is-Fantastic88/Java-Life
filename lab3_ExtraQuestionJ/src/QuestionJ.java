import java.util.Scanner;

public class QuestionJ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max = 0;
		int n = sc.nextInt();
		if (n >= 1 && n <= 100) {
			for (int x = 1; x <= n; x++) {
				for (int z = 1; z <= 10; z++) {
					int input = sc.nextInt();
					if (input > max) {
						max = input;
					}

				}
				System.out.println("Case #" + x + ": " + max);
			}
		}
	}

}
