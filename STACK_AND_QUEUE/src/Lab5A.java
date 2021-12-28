import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Lab5A {

	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new FileReader("input.txt"));
		int num = Integer.parseInt(bf.readLine());

		ArrayList<Integer> arr = new ArrayList<Integer>();
		for (int z = 0; z < num; z++) {
			int max = 0;
			StringTokenizer token = new StringTokenizer(bf.readLine(), " ");
			int input = Integer.parseInt(token.nextToken());
			if (input == 1) {
				while (token.hasMoreTokens()) {
					arr.add(Integer.parseInt(token.nextToken()));
				}
			} else if (input == 2) {
				arr.remove(arr.size() - 1);

			} else if (input == 3) {

				for (int x = 0; x < arr.size(); x++) {
					if (arr.get(x) > max) {
						max = arr.get(x);
					}
				}
				System.out.println(max);
			}
		}
	}

}
