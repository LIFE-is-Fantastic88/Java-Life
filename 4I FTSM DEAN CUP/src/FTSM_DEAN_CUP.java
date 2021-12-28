import java.util.Scanner;

public class FTSM_DEAN_CUP {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		for (int n = 1; n <= input; n++) {

			int arr[][] = new int[4][3];
			for (int student = 0; student < 4; student++) {
				for (int result = 0; result < 3; result++) {
					arr[student][result] = sc.nextInt();
				}
			}
			System.out.print("Case #" + n + ":");
			int max = 0;
			int winner = 0;
			for (int student = 0; student < 4; student++) {
				int total1 = 0;

				for (int result = 0; result < 3; result++) {
					if (result == 0) {
						total1 = arr[student][result] * 3;
					} else if (result == 1) {
						total1 = arr[student][result] + total1;
					} else if (result == 2) {
						total1 = total1 + 0;
						System.out.print(" " + total1);
					}
				}
				if (total1 > max) {
					max = total1;
					winner = student + 1;
				}
			}
			System.out.println(" " + winner);
		}
	}
}