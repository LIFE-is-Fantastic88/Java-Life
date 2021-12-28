import java.util.Scanner;

public class SectionBQ1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();

		for (int x = 1; x <= col; x++) {
			System.out.print("*" + "  ");
		}
		System.out.println();

		for (int y = 1; y <= row - 2; y++) {

			for (int z = 1; z <= 1; z++) {
				System.out.print("*" + "  ");
			}
			for (int p = 1; p <= col - 2; p++) {
				System.out.print("   ");
			}
			for (int q = 1; q <= 1; q++) {
				System.out.print("*" + "  ");
			}
			System.out.println();
		}
		for (int r = 1; r <= col; r++) {
			System.out.print("*" + "  ");
		}
	
	
	
	
	
	
	
	
		}
	

}
