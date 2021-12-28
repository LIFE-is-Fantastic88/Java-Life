import java.util.Scanner;

public class SectionBQ3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();

		for (int z = 1; z <= row; z++) {
			for (int x = 1; x <= col; x++) {
				System.out.print("+" + "-");
			}
			System.out.print("+");
			System.out.println();
			for (int y = 1; y <= col; y++) {
				System.out.print("|" + " ");
			}
			System.out.print("|");
			System.out.println();
		}
		for (int x = 1; x <= col; x++) {
			System.out.print("+" + "-");
		}
		System.out.print("+");
	}

}
