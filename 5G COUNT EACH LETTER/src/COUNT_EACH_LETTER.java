import java.util.Scanner;

public class COUNT_EACH_LETTER {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] count = new int[38];

		for (int i = 0;;) {
			String str = sc.nextLine();
			String str2 = str.toLowerCase();
			if (str.equals("#"))
				break;
			else {
				for (int j = 0, k = 0; j < str.length(); k++) {
					if (str2.substring(j, j + 1).equals(Letter(k))) {
						count[k]++;
						j++;
						k = 0;
					} else if (k == 36) {
						k = 0;
						j++;
					}
				}
				System.out.print("Case #" + (i + 1) + ": ");
				i++;
				for (int l = 0; l < count.length; l++) {
					if (count[l] != 0) {
						System.out.print(Letter(l) + "(" + count[l] + ") ");
					}
				}
				System.out.println();
				for (int m = 0; m < count.length; m++) {
					count[m] = 0;
				}

			}
		}

	}

	public static String Letter(int arg) {
		String[] letter = { " ", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q",
				"r", "s", "t", "u", "v", "w", "x", "y", "z", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" };
		return letter[arg];
	}
}


