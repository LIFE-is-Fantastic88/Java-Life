import java.util.Scanner;

public class tutorial8_SectionB2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String arr[] = new String[2];
		String arr2[] = new String[2];
		int arr3[] = new int[2];
		for (int z = 0; z <= 1; z++) {
			arr[z] = sc.nextLine();
		}

		for (int x = 0; x <= 1; x++) {
			arr2[x] = arr[x].substring(0, 1);
		}

		arr3[0] = arr2[0].compareToIgnoreCase(arr2[1]);
		arr3[1] = arr2[1].compareToIgnoreCase(arr2[0]);
		for (int k = 1; k <= 2; k++) {
			if (k == 1) {
				if (arr3[1] > arr3[0]) {
					System.out.println(arr[0]);
				} else if (arr3[1] < arr3[0]) {
					System.out.println(arr[1]);
				}
			}
			if (k == 2) {
				if (arr3[0] < arr3[1]) {
					System.out.println(arr[1]);
				} else if (arr3[0] > arr3[1]) {
					System.out.println(arr[0]);
				}
			}
		}
	}

}
