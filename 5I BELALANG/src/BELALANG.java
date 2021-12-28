import java.util.Scanner;

public class BELALANG {

	public static void main(String[] args) {
		String arr1[] = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s",
				"t", "u", "v", "w", "x", "y", "z", " " };
		String arr2[] = { " ", "z", "y", "x", "w", "v", "u", "t", "s", "r", "q", "p", "o", "n", "m", "l", "k", "j", "i",
				"h", "g", "f", "e", "d", "c", "b", "a" };
		Scanner sc = new Scanner(System.in);
		String N = sc.nextLine();
		int n = Integer.parseInt(N);

		for (int z = 1; z <= n; z++) {
			String input = sc.nextLine();
			System.out.print("Case #" + z + ": ");
			for (int check = 0; check < input.length(); check++) {
				String alpha = input.substring(check, check + 1);
				for (int sample = 0; sample < arr1.length; sample++) {
					if (alpha.equals(arr1[sample])) {
						System.out.print(arr2[sample]);
					}
				}
			}
			System.out.println();
		}
	}
}
