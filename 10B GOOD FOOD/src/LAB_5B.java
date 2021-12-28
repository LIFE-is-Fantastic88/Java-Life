import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class LAB_5B {

	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new FileReader("input.txt"));
		int num = Integer.parseInt(bf.readLine());
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int current = 0;
		String n;
		for (int z = 0; z < num; z++) {
			StringTokenizer token = new StringTokenizer(bf.readLine(), " ");
			if (z == 0) {
				current += Integer.parseInt(token.nextToken());
			} else {
				n = token.nextToken();
			}
			int food = Integer.parseInt(token.nextToken());

			if (food == 1) {
				current += 10;
			} else if (food == 2) {
				current += 20;
			} else if (food == 3) {
				current += 5;
			} else if (food == 4) {
				current += 15;
			} else if (food == 5) {
				current += 7;
			}

			arr.add(current);

		}
		int cus = 0;
		int remain = arr.size();
		while (!arr.isEmpty()) {
			if (arr.get(cus) < 60) {
				System.out.println("Servicing customer " + (cus + 1) + " at :" + arr.get(cus) + "th minute");

				cus++;
				remain--;
			} else {
				break;
			}
		}
		System.out.println("Number of customers served " + (cus));
		System.out.println("Customers left in queue: " + remain);
	}

}
