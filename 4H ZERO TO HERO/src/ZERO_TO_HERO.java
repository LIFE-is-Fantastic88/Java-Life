import java.util.Scanner;

public class ZERO_TO_HERO {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		for (int n = 1; n <= input; n++) {
			int arr[] = new int[50];
			int inf = 1;
			int num1 = 0;
			for (int z = 1; z <= inf; inf++) {
				int num = sc.nextInt();
				if (num == -1) {
					break;
				}
				num1++;
				arr[inf] = num;
			}
			System.out.print("Case #" + n + ": [");
			int max = 0;
			for (int z = 1; z <= num1; z++) {
				if (z == num1) {
					if (arr[z] % 2 != 0 && arr[z] >= max) {
						max = arr[z];
						System.out.print(max);
					} else if (arr[z] == 0) {
						if (max != 0) {
							System.out.print(max);
						} else {
							System.out.print(arr[z]);
						}
					} else if (arr[z] % 2 == 0) {
						System.out.print(arr[z]);
					}
					System.out.print("]");
				} else if (arr[z] % 2 != 0 && arr[z] >= max) {
					max = arr[z];
					System.out.print(max + ", ");
				} else if (arr[z] == 0) {
					if (max != 0) {
						System.out.print(max + ", ");
					} else {
						System.out.print(arr[z] + ", ");
					}
				} else if (arr[z] % 2 == 0) {
					System.out.print(arr[z] + ", ");
				}
			}
			System.out.println();
		}
	}

}
