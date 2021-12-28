import java.util.Scanner;

public class RAINFALL {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double mth[] = new double[12];

		int n = sc.nextInt();
		for (int z = 1; z <= n; z++) {
			int high = 0;
			for (int i = 0; i < 12; i++) {
				mth[i] = sc.nextDouble();
			}
			System.out.print("Case #" + z + ": ");
			double max = 0;
			for (int j = 0; j < 12; j++) {
				if (mth[j] > max) {
					max = mth[j];
				}
			}
			for (int j = 0; j < 12; j++) {
				if (max == mth[j]) {
					System.out.print(j + 1);
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}