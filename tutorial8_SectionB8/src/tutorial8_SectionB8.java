import java.util.Scanner;

public class tutorial8_SectionB8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		displaySortedNum(num1, num2, num3);
	}

	public static void displaySortedNum(int num1, int num2, int num3) {
		int first = 0, second = 0, third = 0;
		if (num1 > num2 && num1 > num3) {
			first = num1;
		} else if (num2 > num1 && num2 > num3) {
			first = num2;
		} else if (num3 > num1 && num3 > num2) {
			first = num3;
		}
		if (num1 > num2 && num1 < num3) {
			second = num1;
		} else if (num2 > num1 && num2 < num3) {
			second = num2;
		} else if (num3 > num1 && num3 < num2) {
			second = num3;
		}
		if (num1 < num2 && num1 < num3) {
			third = num1;
		} else if (num2 < num1 && num2 < num3) {
			third = num2;
		} else if (num3 < num1 && num3 < num2) {
			third = num3;
		}

		System.out.println(first);
		System.out.println(second);
		System.out.println(third);
	}

}
