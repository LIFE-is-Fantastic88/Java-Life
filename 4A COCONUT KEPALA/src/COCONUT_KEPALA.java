import java.util.Scanner;

public class COCONUT_KEPALA {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int x = 1; x <= T; x++) {
			int num1 = 0;
			int num2 = 100;
			int arr[] = new int[100];
			int day = sc.nextInt();
			for (int z = 1; z <= day; z++) {
				int n = sc.nextInt();
				arr[n] = arr[n] + 1;

				if (n > num1) {
					num1 = n;
				}
				if (n <= num2) {
					num2 = n;
				}
			}
			System.out.println(num2 + " " + arr[num2] + " " + num1 + " " + arr[num1]);

		}
	}

}
