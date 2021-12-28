import java.util.Scanner;

public class WORD_COUNTER {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String input = sc.nextLine();
		int INPUT = Integer.parseInt(input);
		if (INPUT >= 1 && INPUT <= 50) {
			for (int x = 1; x <= INPUT; x++) {
				int sum = 0;
				String str = sc.nextLine();
				for (int z = 0; z <= str.length(); z++) {
					if (str.substring(z, z + 1).equals("#")) {
						break;
					}
					if (str.substring(z, z + 1).equals(" ")) {
						sum++;
					}
				}

				System.out.println("Case #" + x + ": " + sum);
			}
		}

	}
}
