import java.util.Scanner;

public class ABOVE_AVERAGE {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int z = 1; z <= n; z++) {
			double app[] = new double[100];
			int y = 1;
			double sum1 = 0;
			double total;
			double num2 = 0;
			double sum = 0;
			int num = sc.nextInt();
			app[y] = num;
			while (num != -1) {

				sum = sum + num;
				sum1 = sum1 + 1;
				y++;
				num = sc.nextInt();
				app[y] = num;
			}
			total = sum / sum1;
			y = 1;
			for (int x = 1; x <= sum1; x++) {
				double num3 = app[y];
				if (app[y] >= total) {
					num2 = num2 + 1;
				}
				y++;
			}
			double average = (num2 / sum1) * 100;
			System.out.println("Case #" + z + ": " + Math.round(total) + " " + Math.round(average) + "%");

		}
	}

}
