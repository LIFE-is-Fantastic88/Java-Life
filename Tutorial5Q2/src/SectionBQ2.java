import java.util.Scanner;

public class SectionBQ2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int n = 1;
		int p = num - 1;
		for (int y = 1; y <= num; y++) {
			for (int x = 1; x <= n; x++) {
				System.out.print(x);
			}
			for (int z = 1; z <= p; z++) {
				System.out.print("*");
			}
			p--;
			n++;
			System.out.println();
		}
	}

}
