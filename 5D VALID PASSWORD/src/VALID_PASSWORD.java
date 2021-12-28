import java.util.Scanner;

public class VALID_PASSWORD {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 1;
		int num = 1;
		for (int z = 1; z <= n; n++) {
			String input = sc.nextLine();
			if (input.equals("#")) {
				break;
			}
			if (input.length() >= 5) {
				boolean flag = true;
				for (int x = 0; x < input.length(); x++) {
					char temp = (input.charAt(x));
					if (Character.isLowerCase(temp) || Character.isDigit(temp)) {
					} else {
						flag = false;
						break;
					}
				}
				if (flag == true) {
					System.out.println("Case #" + num + ": valid");
				} else {
					System.out.println("Case #" + num + ": Invalid");
				}
			} else {
				System.out.println("Case #" + num + ": Invalid");
			}
			num++;
		}
	}
}
