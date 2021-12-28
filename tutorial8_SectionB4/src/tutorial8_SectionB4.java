import java.util.Scanner;

public class tutorial8_SectionB4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String arr[] = { "F", "D", "C", "B", "A" };
		int sum = 0;
		for (int z = 0; z <= sum; sum++) {
			String str = sc.nextLine();

			for (int x = 0; x <= arr.length; x++) {
				if (str.equals(arr[x])) {
					System.out.println(x);
					break;
				} else if (x == 4) {
					System.out.println("invalid");
					break;
				}
			}
		}

	}

}
