import java.util.Scanner;
import java.text.DecimalFormat;

public class MULTIPLE_CHOICE {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		int num = 1;
		int num1 = 1;
		for (int n = 1; n <= num; num++) {
			String INPUT = sc.nextLine();
			int input = Integer.parseInt(INPUT);
			if (input == 0) {
				break;
			}
			String str = sc.nextLine();
			String arr[][] = new String[input][input];
			for (int student = 0; student < input; student++) {
				for (int ans = 0; ans < input; ans++) {
					arr[student][ans] = sc.nextLine();
				}
			}
			System.out.println("Case #" + num1 + ":");
			num1++;
			for (int students = 0; students < input; students++) {
				double sum = 0;
				for (int ans1 = 0; ans1 < input; ans1++) {
					if (arr[students][ans1].equalsIgnoreCase(str.substring(ans1, ans1 + 1))) {
						sum = sum + 1;
					} else {
						sum = sum - 0.25;
					}
					if (ans1 == (input - 1)) {
						System.out.println("Student " + students + ": " + df.format(sum));
					}
				}
			}
		}
	}
}
