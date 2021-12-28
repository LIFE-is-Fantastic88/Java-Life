import java.util.Scanner;

public class INNER_PRODUCT {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		for (int p = 1; p <= input; p++) {
			int arr[] = new int[21];
			int app[] = new int[21];
			int N = sc.nextInt();
			for (int z = 1; z <= N; z++) {
				int num = sc.nextInt();
				arr[z] = num;
			}
			for (int x = 1; x <= N; x++) {
				int num1 = sc.nextInt();
				app[x] = num1;
			}
			int sum = 0;
			for (int y = 1; y <= N; y++) {
				sum = sum + (arr[y] * app[y]);
			}
			System.out.println("Case #" + p + ": " + sum);

		}
	}
}
