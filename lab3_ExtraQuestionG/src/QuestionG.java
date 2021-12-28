import java.util.Scanner;

public class QuestionG {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		if (n >= 1 && n <= 100) {
			for (int q = 1; q <= n; q++) {
				int amplitude = sc.nextInt();
				int freq = sc.nextInt();
				if (amplitude >= 1 && amplitude <= 9 && freq >= 1 && freq <= 10) {
					for (int k = 1; k <= freq; k++) {
						int num = 1;
						int num1 = 1;
						for (int z = 1; z <= amplitude; z++) {
							for (int x = 1; x <= num1; x++) {
								System.out.print(num);
							}
							num++;
							num1++;
							System.out.println();
						}
						for (int y = 1; y <= amplitude - 1; y++) {
							for (int p = 1; p <= num1 - 2; p++) {
								System.out.print(num - 2);
							}
							num--;
							num1--;
							System.out.println();
						}
					}
				}
			}

		}
	}
}