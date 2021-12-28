import java.util.Scanner;

public class SectionBQ4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int row, col;
		row = sc.nextInt();
		col = sc.nextInt();

		for (int p = 1; p <= row / 2; p++) {
			for (int x = 1; x <= col / 2; x++) {
				System.out.print("# ");
			}
			if (col % 2 != 0) {
				System.out.print("#");
			} else {
				System.out.print("");
			}
			System.out.println();

			for (int y = 1; y <= col / 2; y++) {
				System.out.print(" #");
			}
			System.out.println();
		}

		if (row % 2 != 0) {
			for (int z = 1; z <= col / 2; z++) {

				System.out.print("# ");
			}
			if (col % 2 != 0) {
				System.out.print("#");
			} else {
				System.out.print("");
			}
		}

	}

}
		
       
	
		
	
		
		
	


