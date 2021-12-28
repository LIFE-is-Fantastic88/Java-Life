import java.util.Scanner;

public class SECRET_MESSAGE {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String arr[] = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s",
				"t", "u", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N",
				"O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "0", "1", "2", "3", "4", "5", "6", "7", "8",
				"9" };
		String arr2[] = { "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t",
				"u", "v", "w", "x", "y", "z", "a", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O",
				"P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "A", "1", "2", "3", "4", "5", "6", "7", "8", "9",
				"0" };
		int num = 1;
		for (int p = 1; p <= num; num++) {

			String str = sc.nextLine();
			if (str.equals("#")) {
				break;
			}
			System.out.print("Case #" + num + ": ");
			for (int z = 0; z < str.length(); z++) {
				String str2 = str.substring(z, z + 1);
				for (int x = 0; x < 62; x++) {

					if (str2.equals(arr[x])) {
						System.out.print(arr2[x]);
						break;
					}

					else if (x == 61) {

						System.out.print(str2);
						break;
					}
				}

			}
			System.out.println();
		}
	}
}
