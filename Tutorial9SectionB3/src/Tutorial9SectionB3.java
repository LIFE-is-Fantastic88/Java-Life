import java.util.Scanner;

public class Tutorial9SectionB3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int arr[][] = new int[8][8];
		for (int row = 0; row < 8; row++) {
			for (int colomn = 0; colomn < 8; colomn++) {
				arr[row][colomn] = sc.nextInt();
			}
		}
		int arr2[] = new int[8];
		for (int row1 = 0; row1 < 8; row1++) {
			int ans = 0;
			for (int colomn1 = 0; colomn1 < 8; colomn1++) {
				ans += arr[row1][colomn1];
			}
			arr2[row1] = ans;
		}

		for (int z = 0; z < 8; z++) {
			if (arr2[z] == 0) {
				System.out.println("the row(s) with all ones is row" + (z + 1));
			}
		}

	}

}
