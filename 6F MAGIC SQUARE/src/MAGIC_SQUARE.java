import java.util.Scanner;

public class MAGIC_SQUARE {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int z = 1; z <= n; z++) {
			int arr[][] = new int[3][3];
			for (int row = 0; row < 3; row++) {
				for (int colomn = 0; colomn < 3; colomn++) {
					arr[row][colomn] = sc.nextInt();
				}
			}
			System.out.print("Case #" + z + ": ");
			boolean flag = true;
			for (int row = 0; row < 3; row++) {
				int sum = 0;
				int sum1 = 0;
				int sum2 = 0;
				int sum3 = 0;
				int last = 2;
				for (int colomn = 0; colomn < 3; colomn++) {
					sum += arr[row][colomn];
					sum1 += arr[colomn][row];
					sum2 += arr[colomn][colomn];
					sum3 += arr[last][last];
					last--;
				}
				if (sum == 15 && sum1 == 15 && sum2 == 15 && sum3 == 15) {

				} else {
					flag = false;
					break;
				}
			}
			if (flag == true) {
				System.out.println("[1]");
			} else {
				System.out.println("[0]");

			}

		}
	}

}
