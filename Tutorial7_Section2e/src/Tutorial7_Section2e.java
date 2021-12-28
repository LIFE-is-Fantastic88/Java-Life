import java.util.Scanner;

public class Tutorial7_Section2e {
	public static int calculateSum(int[] data) {
		int sum = 0;
		for (int x = 0; x < data.length; x++) {
			sum = sum + data[x];

		}
		return sum;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int data[] = new int[n];
		for (int z = 0; z < n; z++) {
			data[z] = sc.nextInt();
		}
		int num = calculateSum(data);
		System.out.print(num);
	}

}
