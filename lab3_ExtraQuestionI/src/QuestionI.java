import java.util.Scanner;

public class QuestionI {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n >= 1 && n <= 100) {
			for (int q = 1; q <= n; q++) {

				int size = sc.nextInt();
				if (size >= 1 && size <= 40) {
					int num1 = 1;
					int num2 = 0;
					int num = size;
					for (int p = 1; p <= size; p++) {
						for (int z = 1; z <= num; z++) {
							System.out.print(" ");
						}

						for (int y = 1; y <= num1; y++) {
							System.out.print("*");
						}
						for (int x = 1; x <= num2; x++) {
							System.out.print("*");
						}

						num2++;
						num1++;
						num--;
						System.out.println();
					}
				}
			}
		}
	}

}
