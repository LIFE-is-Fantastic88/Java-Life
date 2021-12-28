import java.util.Scanner;

public class QuestionA {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double hour, min, sec;
		int input = sc.nextInt();
		if (input >= 1 && input <= 20) {
			for (int z = 0; z < input; z++) {
				int num = sc.nextInt();

				hour = num / 3600;
				min = (num % 3600) / 60;
				sec = (num % 3600) % 60;

				System.out.printf("%.0f:%.0f:%.0f\n", hour, min, sec);
			}
		}
	}

}
