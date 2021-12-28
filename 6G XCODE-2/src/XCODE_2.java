import java.util.Scanner;

public class XCODE_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inf = 1;
		for (int z = 1; z <= inf; inf++) {
			int size = sc.nextInt();
			int code = sc.nextInt();
			if (size == 0 && code == 0) {
				break;
			}
			int xcode = size * 2;
			int arr[][] = new int[size][size];
			for (int row = 0; row < size; row++) {
				for (int colomn = 0; colomn < size; colomn++) {
					arr[row][colomn] = sc.nextInt();
				}
			}
			System.out.print("Case #" + inf + ": ");
			int sum = 0;
			for (int colomn = 0; colomn < size; colomn++) {
				sum += arr[code - 1][colomn];
			}
			if (sum > xcode) {
				System.out.println("attack");
			} else {
				System.out.println("defense");
			}

		}
	}
}
