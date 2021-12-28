import java.util.Scanner;

public class QuestionL {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		if (n >= 1 && n <= 1000) {

			for (int a = 1; a <= n; a++) {

				int x = sc.nextInt();
				int y = sc.nextInt();
				if (x >= -1000 && x <= 1000 && y >= -1000 && y <= 1000) {
					if (x == 0 || y == 0) {
						System.out.println("Case " + "#" + a + ":" + " AXIS");
					}
					if (x > 0 && y > 0) {
						System.out.println("Case " + "#" + a + ":" + " Q1");
					}
					if (x < 0 && y > 0) {
						System.out.println("Case " + "#" + a + ":" + " Q2");

					}
					if (x < 0 && y < 0) {
						System.out.println("Case " + "#" + a + ":" + " Q3");

					}
					if (x > 0 && y < 0) {
						System.out.println("Case " + "#" + a + ":" + " Q4");
					}
				}
			}
		}
	}
}
