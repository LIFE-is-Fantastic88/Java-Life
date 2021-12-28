import java.util.ArrayList;
import java.util.Scanner;

public class GIRL_SECRETS {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> arr = new ArrayList<>();

		int num = 0;
		for (int x = 0; x <= num; num++) {

			String input = sc.nextLine();
			if (input.equals("***")) {
				break;
			}
			arr.add(input);

		}

		int num1 = sc.nextInt();
		while (num1 > 0) {
			int arr2[] = new int[num1];

			for (int z = 0; z < num1; z++) {
				arr2[z] = sc.nextInt();
			}

			for (int p = 0; p < arr2.length; p++) {
				if (p == 0) {
					int num3 = arr2[p] - 1;

					String item = arr.get(num3);
					String result = item.substring(0, 1).toUpperCase() + item.substring(1);

					System.out.print(result);
				} else {
					int num3 = arr2[p] - 1;

					String item = arr.get(num3);
					System.out.print(item);
				}

				if (p < arr2.length - 1) {
					System.out.print(" ");
				}
				if (p == arr2.length - 1) {
					System.out.print(".");
				}
			}

			System.out.println();
			num1 = sc.nextInt();
		}
	}

}
