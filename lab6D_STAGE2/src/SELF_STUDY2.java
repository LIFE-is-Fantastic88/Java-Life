import java.text.DecimalFormat;
import java.util.Scanner;

public class SELF_STUDY2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		int numnum = 1;
		int cases = 1;
		for (int j = 1; j <= numnum; numnum++) {
			int input = sc.nextInt();
			if (input == 0) {
				break;
			}
			int totalmark[] = new int[input];
			int arr[][] = new int[input][7];
			for (int student = 0; student < input; student++) {
				for (int mark = 0; mark < 7; mark++) {
					arr[student][mark] = sc.nextInt();
				}
			}
			for (int student1 = 0; student1 < input; student1++) {
				int sum = 0;
				for (int mark1 = 0; mark1 < 7; mark1++) {
					sum = sum + arr[student1][mark1];
					if (mark1 == 6) {
						totalmark[student1] = sum;
					}
				}
			}
			int num1 = 0;
			for (int x = 0; x < input; x++) {
				if (totalmark[x] > 25) {
					num1++;
				}
			}
		
			System.out.println("Case #" + cases + ": " + num1);
			cases++;
			for (int p = 0; p < input; p++) {
				System.out.println("Student " + p + ": " + totalmark[p]);
			}
		}
	}
}
