import java.util.Scanner;

public class COUNT_EACH_LETTER_NEW {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 1;
		for (int inf = 1; inf <= n; n++) {
			String str[] = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r",
					"s", "t", "u", "v", "w", "x", "y", "z" };
			int str2[] = new int[str.length];
			String input1 = sc.nextLine();
			if (input1.equals("#")) {
				break;
			}
			System.out.print("Case #" + n + ": ");
			String input = input1.toLowerCase();
			for (int z = 0; z < input.length(); z++) {
				for (int x = 0; x < str.length; x++) {
					if (input.substring(z, z + 1).equals(str[x])) {
						str2[x]++;
					}
				}
			}
			for (int y = 0; y < str.length; y++) {
				if (str2[y] != 0) {
					System.out.print(str[y] + "(" + str2[y] + ")" + " ");
				}
			}
			System.out.println();
		}
	}

}