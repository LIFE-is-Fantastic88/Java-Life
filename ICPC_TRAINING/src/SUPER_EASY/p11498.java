package SUPER_EASY;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p11498 {

	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			String cases = bf.readLine();
			if (Integer.parseInt(cases) == 0) {
				break;
			}
			String divisionpoint = bf.readLine();
			String arr[] = divisionpoint.split(" ");
			int x = Integer.parseInt(arr[0]);
			int y = Integer.parseInt(arr[1]);
			for (int z = 0; z < Integer.parseInt(cases); z++) {
				String coo = bf.readLine();
				String arr1[] = coo.split(" ");
				int x1 = Integer.parseInt(arr1[0]);
				int y1 = Integer.parseInt(arr1[1]);
				if (x1 == x || y1 == y) {
					System.out.println("divisa");
				} else if (x1 > x && y1 > y) {
					System.out.println("NE");
				} else if (x1 > x && y1 < y) {
					System.out.println("SE");
				} else if (x1 < x && y1 > y) {
					System.out.println("NO");
				} else if (x1 < x && y1 < y) {
					System.out.println("SO");
				}
			}
		}
	}
}
