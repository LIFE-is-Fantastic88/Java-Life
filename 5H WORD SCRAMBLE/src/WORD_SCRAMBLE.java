import java.util.Scanner;

public class WORD_SCRAMBLE {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();
		int N = Integer.parseInt(n);
		for (int p = 1; p <= N; p++) {
			String input = sc.nextLine();
			int space = 0;
			for (int z = 0; z < input.length(); z++) {

				if (input.substring(z, z + 1).equals("#")) {
					break;
				} else if (input.substring(z, z + 1).equals(" ")) {
					space++;
				}
			}
			String str[] = input.split(" ", space + 1);
			String str2[] = new String[space + 1];
			for (int x = 0; x < space + 1; x++) {

				String rev = new StringBuffer(str[x]).reverse().toString();
				str2[x] = rev;
			}
			System.out.print("Case #" + p + ": ");
			for (int y = 0; y < space + 1; y++) {
				if (y == space) {
					break;
				}
				System.out.print(str2[y] + " ");
			}
			System.out.println();
		}
	}

}
