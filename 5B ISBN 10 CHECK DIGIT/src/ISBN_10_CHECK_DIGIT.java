import java.util.Scanner;

public class ISBN_10_CHECK_DIGIT {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[9];
		String input = sc.nextLine();
		int INPUT = Integer.parseInt(input);
		if (INPUT >= 1 && INPUT <= 50) {
			for (int q = 1; q <= INPUT; q++) {

				String str = sc.nextLine();
				for (int z = 0; z < 9; z++) {
					String str2 = str.substring(z, z + 1);
					int num = Integer.parseInt(str2);
					arr[z] = num;
				}
				int sum = 0;
				int num1 = 10;
				for (int x = 0; x < 9; x++) {
					sum = sum + (arr[x] * num1);
					num1--;
				}
				int ans = (11 - (sum % 11)) % 11;
				System.out.println("Case #" + q + ": " + ans);

			}
		}
	}
}