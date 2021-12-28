import java.util.Scanner;

public class tutorial8_SectionB6 {

	public static void displayPattern(int n) {
		int num = 1;
		for (int z = 1; z <= n; z++) {
			for (int x = 1; x <= num; x++) {
				System.out.print(x + " ");
			}
			System.out.println();
			num++;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		displayPattern(n);
	}

}
