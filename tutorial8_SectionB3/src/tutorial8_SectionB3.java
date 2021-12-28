import java.util.Scanner;

public class tutorial8_SectionB3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String arr[] = { "a", "e", "i", "o", "u", "A", "E", "I", "O", "U" };
		int num = 0;
		for (int z = 0; z <= num; num++) {
			String str = sc.nextLine();
			if (str.equals("#")) {
				System.out.print("invalid");
				break;
			}
			for (int x = 0; x <= arr.length; x++) {
				if (str.equals(arr[x])) {
					System.out.println("vowel");
					break;
				} else if (x == 9) {
					System.out.println("consonant");
					break;
				}
			}

		}
	}

}
