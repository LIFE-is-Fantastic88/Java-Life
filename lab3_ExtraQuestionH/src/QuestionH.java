import java.util.Scanner;

public class QuestionH {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int size = sc.nextInt();
		if (n >= 1 && n <= 100 && size >= 1 && size <= 40) {
			for (int y = 1; y <= n; y++) {
				for (int z = 1; z <= size; z++) {
					for (int x = 1; x <= z; x++) {
						System.out.print(x);
					}
					System.out.println();
				}
			}
		}
	}
}
