import java.util.Scanner;

public class QuestionB {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int num = sc.nextInt();
		if (num >= 1 && num <= 20) {
			for (int x = 1; x <= num; x++) {
				int input = sc.nextInt();
				if (input > 10) {
					sum = sum + 1;
				}
			}
			System.out.print(sum);
		}

	}

}
