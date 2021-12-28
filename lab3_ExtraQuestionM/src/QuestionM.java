import java.util.Scanner;

public class QuestionM {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		if (n >= 1 && n <= 100) {
			for (int z = 1; z <= n; z++) {
				int dd = sc.nextInt();
				int MMM = sc.nextInt();
				int yyyy = sc.nextInt();
				switch (MMM) {
				case 1:
					System.out.print(dd + " " + "January" + " " + yyyy);
					break;
				case 2:
					System.out.print(dd + " " + "February" + " " + yyyy);
					break;
				case 3:
					System.out.print(dd + " " + "March" + " " + yyyy);
					break;
				case 4:
					System.out.print(dd + " " + "April" + " " + yyyy);
					break;
				case 5:
					System.out.print(dd + " " + "May" + " " + yyyy);
					break;
				case 6:
					System.out.print(dd + " " + "June" + " " + yyyy);
					break;
				case 7:
					System.out.print(dd + " " + "July" + " " + yyyy);
					break;
				case 8:
					System.out.print(dd + " " + "August" + " " + yyyy);
					break;
				case 9:
					System.out.print(dd + " " + "September" + " " + yyyy);
					break;
				case 10:
					System.out.print(dd + " " + "October" + " " + yyyy);
					break;
				case 11:
					System.out.print(dd + " " + "November" + " " + yyyy);
					break;
				case 12:
					System.out.print(dd + " " + "December" + " " + yyyy);
					break;
				}
				System.out.println();

			}

		}
	}
}
