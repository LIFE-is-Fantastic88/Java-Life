import java.util.ArrayList;
import java.util.Scanner;

public class MONK_AND_CHAMBER_OF_SECRETS {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		ArrayList<Integer> position = new ArrayList<Integer>();
		for (int z = 0; z < N; z++) {
			int spider = sc.nextInt();
			arr.add(spider);
			position.add(spider);
		}
		int num = X;

		for (int x = 0; x < X; x++) {

			if (arr.size() >= X) {
				int max = 0;
				int check = 0;
				for (int y = 0; y < X; y++) {
					if (arr.get(y) > max) {
						max = arr.get(y);
						check = y;
					}
				}
				for (int p = 0; p < position.size(); p++) {
					if (position.get(p).equals(max)) {
						System.out.print((p + 1) + " ");
						if (position.get(p).equals(0)) {
							position.set(p, -1);
						}
						break;
					}
				}
				arr.remove(check);

				for (int q = 0; q < arr.size(); q++) {
					if (arr.get(q) > 0)
						arr.set(q, arr.get(q) - 1);
				}
				for (int q = 0; q < position.size(); q++) {
					if (position.get(q) > 0)
						position.set(q, position.get(q) - 1);
				}

			} else {

				int max1 = 0;
				int check = 0;
				for (int w = 0; w < arr.size(); w++) {

					if (arr.get(w) > max1) {
						max1 = arr.get(w);
						check = w;
					}
				}
				for (int p = 0; p < position.size(); p++) {
					if (position.get(p).equals(max1)) {
						System.out.print((p + 1) + " ");
						if (position.get(p).equals(0)) {
							position.set(p, -1);
						}
						break;
					}
				}
				arr.remove(check);
				for (int q = 0; q < arr.size(); q++) {
					if (arr.get(q) > 0)
						arr.set(q, arr.get(q) - 1);
				}
				for (int q = 0; q < position.size(); q++) {
					if (position.get(q) > 0)
						position.set(q, position.get(q) - 1);
				}

			}

		}
	}
}
