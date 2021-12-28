import java.util.Scanner;

public class ZER0_ROWS_AND_COLS {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 1;
		int num1 = 1;
		for (int n = 1; n <= num; num++, num1++) {
			int input = sc.nextInt();
			if (input == 0) {
				break;
			}
			int arr[][] = new int[input][input];
			int app[] = new int[input];
			int app1[] = new int[input];
			System.out.println("Case #" + num1 + ":");
			num++;
			for (int row = 0; row < input; row++) {
				for (int colomn = 0; colomn < input; colomn++) {
					arr[row][colomn] = sc.nextInt();
				}
			}
			for (int rows = 0; rows < input; rows++) {
				int sum = 0;
				for (int colomns = 0; colomns < input; colomns++) {
					sum = sum + arr[rows][colomns];
					if (colomns == (input - 1)) {
						app[rows] = sum;
						if (sum == 0) {
							System.out.println("row " + (rows + 1));
							break;
						}
					}
				}
			}
			for (int z = 0; z < input; z++) {
				if (app[z] == 0) {
					break;
				} else if (z == input - 1) {
					System.out.println("none");
					break;
				}
			}
			for (int colomn1 = 0; colomn1 < input; colomn1++) {
				int total = 0;
				for (int row1 = 0; row1 < input; row1++) {
					total = total + arr[row1][colomn1];
					if (row1 == (input - 1)) {
						app1[colomn1] = total;
						if (total == 0) {
							System.out.println("col " + (colomn1 + 1));
							break;
						}
					}
				}
			}
			for (int x = 0; x < input; x++) {
				if (app[x] == 0) {
					break;
				} else if (x == input - 1) {
					System.out.println("none");
					break;
				}
			}
		}
	}
}
