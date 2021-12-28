import java.util.Scanner;

public class Tutorial7_Section2f {

	public static int getHighest(int[] data) {
		int num = 0;
		for (int x = 0; x < data.length; x++) {
			if (data[x] >= num) {
				num = data[x];
			}

		}

		return num;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int data[] = new int[n];
		for (int z = 0; z < data.length; z++) {
			data[z] = sc.nextInt();
		}
		int highest = getHighest(data);
		System.out.print(highest);

	}

}
