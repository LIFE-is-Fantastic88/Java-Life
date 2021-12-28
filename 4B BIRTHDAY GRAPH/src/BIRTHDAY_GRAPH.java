import java.util.Scanner;

public class BIRTHDAY_GRAPH {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 1;
		int input = sc.nextInt();
		while (input != 0) {

			int x = 1;
			int arr[] = new int[13];
			String app[] = { " ", "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
			for (int z = 1; z <= input; z++) {
				int dd = sc.nextInt();
				int mm = sc.nextInt();
				int yyyy = sc.nextInt();

				arr[mm] = arr[mm] + 1;

			}
			System.out.println("Case #" + num + ":");
			num++;
			for (int y = 1; y <= 12; y++) {
				for (int k = 1; k <= 1; k++) {
					System.out.print(app[y] + ":");
				}
				for (int p = 1; p <= arr[y]; p++) {
					System.out.print("*");
				}
				System.out.println();
			}
			input = sc.nextInt();
		}
	}

}
