import java.util.Scanner;

public class tutorial8_SectionB7 {

	public static int max(int num1, int num2) {

		int max = 0;
		if (num1 > num2) {
			max = num1;
		} else if (num2 > num1) {
			max = num2;
		}
		return max;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int result = max(num1, num2);
		System.out.println("max is " + result);
	}

}
