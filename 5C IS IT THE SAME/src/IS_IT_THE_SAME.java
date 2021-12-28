import java.util.Scanner;

public class IS_IT_THE_SAME {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		int INPUT = Integer.parseInt(input);
		if (INPUT >= 1 && INPUT <= 50) {
			for (int z = 1; z <= INPUT; z++) {
				String str0 = sc.nextLine();
				String str = str0.toLowerCase();
				int num = str.length();

				if (num % 2 != 0) {
					int num1 = num / 2;
					String str1 = str.substring(0, num1 + 1);
					String str2 = str.substring(num1, num);

					String reverse = new StringBuffer(str1).reverse().toString();

					if (reverse.equals(str2)) {
						System.out.println("Case #" + z + ": " + "Yes");
					} else {
						System.out.println("Case #" + z + ": " + "No");

					}

				} else if (num % 2 == 0) {
					int num1 = num / 2;
					String str1 = str.substring(0, num1);
					String str2 = str.substring(num1, num);
					String reverse = new StringBuffer(str1).reverse().toString();

					if (reverse.equals(str2)) {
						System.out.println("Case #" + z + ": " + "Yes");
					} else {
						System.out.println("Case #" + z + ": " + "No");

					}

				}
			}
		}
	}
}